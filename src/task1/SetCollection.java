package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetCollection {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ss;
        ArrayList<String> list = new ArrayList<String>();

        do {
            ss = in.nextLine();
            list.add(ss);

        } while (ss != "0");
        
        
        hashSet(list);

    }

    public static void hashSet(ArrayList s) {

        HashSet<String> halist = new HashSet<String>();

        halist.addAll(s);
        Iterator<String> itr = halist.iterator();

        while (itr.hasNext()) {
            System.out.print(Collections.frequency(s, itr.next()));
        }
        System.out.println(halist);

    }
}
