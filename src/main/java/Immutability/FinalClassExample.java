package Immutability;

import java.util.HashMap;
import java.util.Iterator;

public class FinalClassExample {
        private final int id;
        private final String name;
        private final HashMap<String, String> testMap;

        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public HashMap<String , String> getTestMap(){
            //return (HashMap<String, String>) testMap.clone();
            return testMap;
        }
        public FinalClassExample(int i, String n, HashMap<String, String> hm){
            this.id=i;
            this.name=n;
            this.testMap=hm;
           /* HashMap<String, String> testMap = new HashMap<>();
            String key;
            Iterator<String> it = hm.keySet().iterator();
            while(it.hasNext()){
                key = it.next();
                testMap.put(key, hm.get(key));
            }
                this.testMap=testMap;*/
        }

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<>();
        h1.put("1", "First");
        h1.put("2", "Second");
        String s = "Original";
        int i=10;
        FinalClassExample ce = new FinalClassExample(i,s,h1);
        System.out.println("Id: "+ce.getId());
        System.out.println("Name: "+ce.getName());
        System.out.println("TestMap: "+ce.getTestMap());

        i=20;
        s="Modified";
        h1.put("3", "Third");

        System.out.println("after change:"+ce.getId());
        System.out.println("After change:"+ce.getName());
        System.out.println("after change:"+ce.getTestMap());

        HashMap<String, String> hmTest = ce.getTestMap();
        hmTest.put("4", "Fourth");

        System.out.println("after changing variable from getter method:"+ ce.getTestMap());

    }

}
