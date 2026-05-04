package pluralsight;

public class room {
    int beds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public int getNumberOfBeds() {return this.beds;}
    public double getPrice() {return this.price;}
    boolean isOccupied() {return this.isOccupied;}
    boolean isDirty() {return this.isDirty;}
    boolean isAvailable() {return this.isAvailable;}

    public void setAvailable(boolean available) {this.isAvailable = available;}
    public void setBeds(int beds) {this.beds = beds;}
    public void setDirty(boolean dirty) {this.isDirty = dirty;}
    public void setOccupied(boolean occupied) {this.isOccupied = occupied;}
    public void setPrice(double price) {this.price = price;}
}
