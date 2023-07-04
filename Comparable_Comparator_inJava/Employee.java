package Comparable_Comparator_inJava;

class Employee implements Comparable<Employee> {
    private String name;
    private String phone;
    private int empID;

    public Employee(String name, String phone, int empID) {
        this.name = name;
        this.phone = phone;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", phone=" + phone + ", empID=" + empID + "]";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public int compareTo(Employee obj) {
        return this.empID-obj.empID;
    }
}
