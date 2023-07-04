package Comparable_Comparator_inJava;
import java.util.Comparator;

public class idComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpID()-o2.getEmpID();
    }
}
