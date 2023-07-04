package Comparable_Comparator_inJava;

import java.util.Comparator;

public class NameComaparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
