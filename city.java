import java.util.HashMap;

public class city {
    public static String travel(HashMap<String,String> tick){
        HashMap<String,String> reve=new HashMap<>();
        for(String key:tick.keySet()){
            reve.put(tick.get(key),key);

        }
        // put the key into values and values into key 
        for(String key:tick.keySet()){
            //in this reve is to city and tic is from city so in to which city is not come 
            // then that city will be our starting one.
            if(!reve.containsKey(key)){
                return key;
            }
        }
        return null;

    }
    public static void main(String []args){
        HashMap<String,String> abc=new HashMap<>();
        abc.put("chennai", "bengaluru");
        abc.put("mumbai","delhi");
        abc.put("goa","chennai");
        abc.put("delhi","goa");

        String start=travel(abc);
        while(abc.containsKey(start)){
           
            System.out.print(start+"->");
            start=abc.get(start);
        }
        System.out.print(start);
        



    }
    
}
