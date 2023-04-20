package design.singleton.coffee;

public class Latte {
    private static final String name = "라떼";
    private static final int price = 2_000;
    private static  Latte latte = new Latte();

    private Latte(){}

    public static synchronized Latte getInstance() {
        if(latte == null){
            latte = new Latte();
        }
        return latte;
    }

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
