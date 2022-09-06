package ch07;

public class Ex_7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }

}

class Product {
    int price;
    int bonusPoint;

    Product() {}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super();
    }

    public String toString() {
        return "Tv";
    }
}