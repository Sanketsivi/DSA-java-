import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EnhancedToDoListApp {
    private JFrame frame;
    private JPanel panel;
    private JTextField taskField;
    private JTextField dueDateField;
    private JComboBox<String> priorityComboBox;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private ArrayList<Task> tasks;

    private static final String FILE_NAME = "tasks.txt";

    public EnhancedToDoListApp() {
        frame = new JFrame("Enhanced To-Do List App");
        panel = new JPanel();
        taskField = new JTextField(20);
        dueDateField = new JTextField(10);
        priorityComboBox = new JComboBox<>(new String[]{"Low", "Medium", "High"});
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        tasks = new ArrayList<>();

        loadTasksFromFile(); // Load tasks from file on startup

        JButton addButton = new JButton("Add Task");
        JButton completeButton = new JButton("Complete Task");
        JButton removeButton = new JButton("Remove Task");
        JButton saveButton = new JButton("Save Tasks");
        JButton sortButton = new JButton("Sort Tasks");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        completeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                completeTask();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeTask();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveTasksToFile();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortTasks();
            }
        });

        panel.add(new JLabel("Task: "));
        panel.add(taskField);
        panel.add(new JLabel("Due Date (yyyy-MM-dd): "));
        panel.add(dueDateField);
        panel.add(new JLabel("Priority: "));
        panel.add(priorityComboBox);
        panel.add(addButton);
        panel.add(completeButton);
        panel.add(removeButton);
        panel.add(saveButton);
        panel.add(sortButton);
        panel.add(new JScrollPane(taskList));

        frame.add(panel);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void addTask() {
        String taskDescription = taskField.getText();
        String dueDateString = dueDateField.getText();
        String priority = (String) priorityComboBox.getSelectedItem();

        if (!taskDescription.isEmpty() && isValidDate(dueDateString)) {
            Date dueDate = parseDate(dueDateString);
            Task task = new Task(taskDescription, dueDate, priority);
            tasks.add(task);
            updateTaskList();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please check your task and due date.");
        }
    }

    private void completeTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
            updateTaskList();
        }
    }

    private void removeTask() {
        clearFields();
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
            updateTaskList();
        }
    }

    private void saveTasksToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.println(task.toFileString());
            }
            JOptionPane.showMessageDialog(frame, "Tasks saved to file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error saving tasks to file.");
            e.printStackTrace();
        }
    }

    private void loadTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task task = Task.fromString(line);
                if (task != null) {
                    tasks.add(task);
                }
            }
            updateTaskList();
        } catch (IOException e) {
            // Ignore if the file doesn't exist yet
        }
    }

    private void sortTasks() {
        Collections.sort(tasks);
        updateTaskList();
    }

    private void updateTaskList() {
        taskListModel.clear();
        for (Task task : tasks) {
            taskListModel.addElement(task.toString());
        }
    }

    private void clearFields() {
        taskField.setText("");
        dueDateField.setText("");
        priorityComboBox.setSelectedIndex(0);
    }

    private boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EnhancedToDoListApp();
            }
        });
    }

    static class Task implements Comparable<Task> {
        private String description;
        private Date dueDate;
        private String priority;

        public Task(String description, Date dueDate, String priority) {
            this.description = description;
            this.dueDate = dueDate;
            this.priority = priority;
        }

        public String getDescription() {
            return description;
        }

        public Date getDueDate() {
            return dueDate;
        }

        public String getPriority() {
            return priority;
        }

        public static Task fromString(String input) {
            String[] parts = input.split(",");
            if (parts.length == 3) {
                String description = parts[0];
                EnhancedToDoListApp app=new EnhancedToDoListApp();
                Date dueDate = app.parseDate(parts[1]);
                String priority = parts[2];
                if (dueDate != null) {
                    return new Task(description, dueDate, priority);
                }
            }
            return null;
        }

        public String toFileString() {
            return description + "," + new SimpleDateFormat("yyyy-MM-dd").format(dueDate) + "," + priority;
        }

        @Override
        public String toString() {
            return description + " - Due: " + new SimpleDateFormat("yyyy-MM-dd").format(dueDate) + " (Priority: " + priority + ")";
        }

        @Override
        public int compareTo(Task otherTask) {
            return this.dueDate.compareTo(otherTask.dueDate);
        }
    }
}
