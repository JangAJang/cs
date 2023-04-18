package design.singleton.coffee;

public class CoffeeMain {
    public static void main(String[] args){
        Latte latte = new Latte();
        Americano americano = new Americano();
        latte.tellInfo();
        americano.tellInfo();
    }
}
