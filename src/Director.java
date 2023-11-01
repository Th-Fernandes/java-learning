public class Director extends Employee {
    public static void main(String[] args) {
//        System.out.println(name);
        double x = 10.0/3.0;
        System.out.println(x);
    }

    public String setName(String newName) {
        setEmployeeName(newName);
        return getEmployeeName();
    }

}
class Employee implements EmployeeFactory {
    private static String name = "Joseph Ocean";
    final private static String cpf = "11111111199";

    public String getEmployeeName() {
        return name;
    }

    public String[] getEmployeePersonalData() {
        return new String[]{name, cpf};
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