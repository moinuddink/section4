public class EmployeeMain {


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAddress("123 Main St");
        employee.setAge(30);

        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Age: " + employee.getAge());
    }
}
