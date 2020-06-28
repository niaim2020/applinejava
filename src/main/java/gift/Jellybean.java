package gift;

public class Jellybean extends Gift {
    private Double calorie;

    public Jellybean(String name, Double weight, Double price, Double calorie) {
        super(name, weight, price);
        this.calorie = calorie;
    }

    public Double getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", calorie = " + calorie + "]";
    }
}
