package item_1;

class Fruit {
    private String name;
    private int pricePerKg;

    public Fruit(String name, int pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public int calculatePrice(int weight) {
        return weight * pricePerKg;
    }
}

class Supermarket {
    private Fruit apple;
    private Fruit strawberry;

    public Supermarket() {
        this.apple = new Fruit("苹果", 8);
        this.strawberry = new Fruit("草莓", 13);
    }

    public int calculateTotalPrice(int appleWeight, int strawberryWeight) {
        int applePrice = apple.calculatePrice(appleWeight);
        int strawberryPrice = strawberry.calculatePrice(strawberryWeight);
        return applePrice + strawberryPrice;
    }
}

public class Code {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        int appleWeight = 2; // 顾客购买的苹果斤数
        int strawberryWeight = 3; // 顾客购买的草莓斤数

        int totalPrice = supermarket.calculateTotalPrice(appleWeight, strawberryWeight);
        System.out.println("总价为：" + totalPrice + "元");
    }
}
