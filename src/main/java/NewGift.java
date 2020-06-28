import gift.Candy;
import gift.Jellybean;
import gift.Gift;

public class NewGift {
    public static void main(String[] args) {
        Gift[] gifts = new Gift[4];
        gifts[0] = new Candy("Твикс", 1.15, 10.25, "Коричневый");
        gifts[1] = new Candy("Сникерс", 1.18, 10.85, "Черный");
        gifts[2] = new Jellybean("Бон Пари",2.32, 8.98, 43.44);
        gifts[3] = new Jellybean("Мармелад",1.18, 11.98, 68.42);

        double totalWeight = 0;
        double totalPrice = 0;
        System.out.println("Что входит в новогодний подарок:");
        for (Gift gift : gifts) {
            totalWeight = gift.getWeight() + totalWeight;
            totalPrice = gift.getPrice() + totalPrice;
            System.out.println(gift);
        }
        System.out.println("Общий вес подарка: " + totalWeight);
        System.out.println("Общая стоимость подарка: " + totalPrice);
    }
}
