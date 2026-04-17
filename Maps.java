
import java.util.HashMap;
import java.util.Map;

public class Maps{
    public static void main(String[] args) {
        Map<String,Integer> nums = new HashMap<String,Integer>();
        nums.put("One", 1);
        nums.put("Two", 2);
        nums.put("three",3);
        nums.put("Four", 4);
        // nums.clear();
        System.out.println(nums.size());
        System.out.println(nums.get("One"));
     //Output PS C:\Users\K\Downloads\AdvanceJava> java Maps
// Error: Could not find or load main class Maps
// Caused by: java.lang.ClassNotFoundException: Maps
// PS C:\Users\K\Downloads\AdvanceJava> java Maps.java
// {}
// PS C:\Users\K\Downloads\AdvanceJava> java Maps.java
// {One=1, Four=4, Two=2, three=3}
// PS C:\Users\K\Downloads\AdvanceJava> java Maps.java
// 4
// PS C:\Users\K\Downloads\AdvanceJava> java Maps.java
// 4
// 1
// PS C:\Users\K\Downloads\AdvanceJava> 


    }
}