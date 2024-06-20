package item_4;

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

    public double calculateDiscountedPrice(int weight, double discount) {
        int originalPrice = calculatePrice(weight);
        return originalPrice * discount;
    }
}

class Supermarket {
    private Fruit apple;
    private Fruit strawberry;
    private Fruit mango;
    private double discountThreshold;
    private double discountAmount;

    public Supermarket() {
        this.apple = new Fruit("苹果", 8);
        this.strawberry = new Fruit("草莓", 13);
        this.mango = new Fruit("芒果", 20);
        this.discountThreshold = 100;
        this.discountAmount = 10;
    }

    public double calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight) {
        int applePrice = apple.calculatePrice(appleWeight);
        double strawberryDiscount = 0.8; // 草莓 8 折促销
        double strawberryPrice = strawberry.calculateDiscountedPrice(strawberryWeight, strawberryDiscount);
        int mangoPrice = mango.calculatePrice(mangoWeight);

        double totalPrice = applePrice + strawberryPrice + mangoPrice;
        if (totalPrice >= discountThreshold) {
            totalPrice -= discountAmount;
        }

        return totalPrice;
    }
}

public class Code {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        int appleWeight = 2; // 顾客购买的苹果斤数
        int strawberryWeight = 10; // 顾客购买的草莓斤数
        int mangoWeight = 1; // 顾客购买的芒果斤数

        double totalPrice = supermarket.calculateTotalPrice(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("总价为：" + totalPrice + "元");
        appleWeight = 2; // 顾客购买的苹果斤数
        strawberryWeight = 3; // 顾客购买的草莓斤数
        mangoWeight = 1; // 顾客购买的芒果斤数
        totalPrice = supermarket.calculateTotalPrice(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("总价为：" + totalPrice + "元");
    }
}
