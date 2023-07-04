package Comparable_Comparator_inJava;
import java.util.ArrayList;
import java.util.Collections;

public class SortingObjects {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "1234", 12));
        employees.add(new Employee("Sohan", "1274", 9));
        employees.add(new Employee("Rhimo", "1434", 11));

        // to sort the objects we have to use comparator and comparable
        // for single sorting logic use comparable
        // for multiple sorting logic use comparator
        // for comparator we have to use separate class holding the logic for sorting.

        // using comparable
       // Collections.sort(employees);
        System.out.println(employees);

        // using comparator object
        //Collections.sort(employees,new idComparator());
        Collections.sort(employees,new NameComaparator());
        System.out.println(employees);

    }
}

