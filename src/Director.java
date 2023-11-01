public class Director extends Employee {
    public static void main(String[] args) {
        System.out.println(name);
    }

    public String setName(String newName) {
        setEmployeeName(newName);
        return getEmployeeName();
    }

}
class Employee implements EmployeeFactory {
    static String name = "Joseph Ocean";

    public String getEmployeeName() {
        return name;
    }

    @Override
    public void setEmployeeName(String newName) {
        name = newName;
    }
}

interface EmployeeFactory {
    static String name = "";

    public String getEmployeeName();
    public void setEmployeeName(String newName);
}