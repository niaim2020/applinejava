package gift;

public class Candy extends Gift {
    private String color;

    public Candy(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", color = " + color + "]";
    }
}
