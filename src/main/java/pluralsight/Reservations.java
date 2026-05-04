package pluralsight;


public class Reservations {
    private String roomType;
    private double price;
    private int nights;
    private boolean isWeekend;
    private double totalPrice;

    public Reservations(String roomType, double price, int nights,
                 boolean isWeekend, double totalPrice) {
        this.roomType = roomType;
        this.price = price;
        this.nights = nights;
        this.isWeekend = isWeekend;
        this.totalPrice = totalPrice;
    }

    public double getPrice() {return this.price;}
    public double getTotalPrice() {return this.totalPrice;}
    public int getNights() {return this.nights;}
    public String getRoomType() {return this.roomType;}
    public boolean isWeekend() {return this.isWeekend;}

    public void setNights(int nights) {this.nights = nights;}
    public void setPrice(double price) {this.price = price;}
    public void setRoomType(String roomType) {this.roomType = roomType;}
    public void setTotalPrice(double totalPrice) {this.totalPrice = totalPrice;}
    public void setWeekend(boolean weekend) {this.isWeekend = weekend;}

}
