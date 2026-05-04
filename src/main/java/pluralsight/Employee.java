package pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {return this.employeeId;}
    public double getPayRate() {return this.payRate;}
    public double getHoursWorked() {return this.hoursWorked;}
    public String getDepartment() {return this.department;}
    public String getName() {return this.name;}
    public double getTotalPay() {return payRate * hoursWorked;}
    public double getOvertimeHoursWorked() {
        double overtimeHours = (hoursWorked - 40);
        if (overtimeHours <= 0) {
            return 0;
        } else {
            return overtimeHours;
        }
    }

    public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}
    public void setDepartment(String department) {this.department = department;}
    public void setHoursWorked(double hoursWorked) {this.hoursWorked = hoursWorked;}
    public void setName(String name) {this.name = name;}
    public void setPayRate(double payRate) {this.payRate = payRate;}


}
