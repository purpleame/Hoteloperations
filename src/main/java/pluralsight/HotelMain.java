package pluralsight;

public class HotelMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(67, "John Six-Seven",
                "67", 67, 67);
        System.out.println("Overtime hours of employee 67: " + employee1.getOvertimeHoursWorked());
    }
}
