package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AccountCollection {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ss;
  List<String> list = new ArrayList<String>();
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("a", 864d);
        map1.put("b", 44.d);
        map1.put("c", 44.d);

        HashMap<String, Double> map2 = new HashMap<>();
        map2.put("a", 864d);
        map2.put("b", 44.d);
        map2.put("n", 44.d);

        // print map details 
        System.out.println("HashMap1: "
                + map1.toString());

        System.out.println("HashMap2: "
                + map2.toString());

      
     

        // print new mapping 
       // System.out.println("New HashMap: " + map1.containsValue(map2));

    }
}
