package item_2;

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
    private Fruit mango;

    public Supermarket() {
        this.apple = new Fruit("苹果", 8);
        this.strawberry = new Fruit("草莓", 13);
        this.mango = new Fruit("芒果", 20);
    }

    public int calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight) {
        int applePrice = apple.calculatePrice(appleWeight);
        int strawberryPrice = strawberry.calculatePrice(strawberryWeight);
        int mangoPrice = mango.calculatePrice(mangoWeight);
        return applePrice + strawberryPrice + mangoPrice;
    }
}

public class Code {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        int appleWeight = 2; // 顾客购买的苹果斤数
        int strawberryWeight = 3; // 顾客购买的草莓斤数
        int mangoWeight = 1; // 顾客购买的芒果斤数

        int totalPrice = supermarket.calculateTotalPrice(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("总价为：" + totalPrice + "元");
    }
}
