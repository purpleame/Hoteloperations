package pluralsight;

public class HotelMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(67, "John Six-Seven",
                "67", 67, 67);
        employee1.punchIn(8);
        employee1.punchOut(24);
    }
}
