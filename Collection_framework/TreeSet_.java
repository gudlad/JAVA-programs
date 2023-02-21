package Collection_framework;

import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet hgt=new TreeSet();

        hgt.add(44);
        hgt.add(12);
        hgt.add(11);
        hgt.add(55);
        hgt.add(33);
        System.out.println(hgt);

        TreeSet ti=new TreeSet();
        ti.add("Bumrah");
        ti.add("Dhoni");
        ti.add("Sachin");
        ti.add("Ganguly");
        ti.add("Kohli");
        
        System.out.println(ti);
       //  [11, 12, 33, 44, 55]
       // [Bumrah, Dhoni, Ganguly, Kohli, Sachin]
    }
}
