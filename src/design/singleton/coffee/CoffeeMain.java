package design.singleton.coffee;

public class CoffeeMain {
    public static void main(String[] args){
        Latte latte = Latte.getInstance();
        Americano americano = Americano.getInstance();
        latte.tellInfo();
        americano.tellInfo();
        Coffee.LATTE.tellInfo();
        Coffee.AMERICANO.tellInfo();
    }
}
