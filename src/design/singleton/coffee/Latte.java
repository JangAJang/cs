package design.singleton.coffee;

public class Latte {
    private static final String name = "라떼";
    private static final int price = 2_000;

    private Latte(){}

    public static final class HOLDER{
        private static final Latte latte = new Latte();
    }

    public static Latte getInstance(){
        return HOLDER.latte;
    }

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
