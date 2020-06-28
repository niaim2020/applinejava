package gift;

public class Gift {
    private String name;
    private Double weight;
    private Double price;

    public Gift(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", price = " + price;
    }
}
