package design.singleton.coffee;

public class Latte {
    private static final String name = "라떼";
    private static final int price = 2_000;
    private static volatile Latte latte = new Latte();

    private Latte(){}

    public static Latte getInstance() {
        if(latte == null){
            synchronizeInitialization();
        }
        return latte;
    }

    private static void synchronizeInitialization(){
        synchronized (Latte.class){
            initializeLatte();
        }
    }

    private static void initializeLatte(){
        if(latte == null){
            latte = new Latte();
        }
    }

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
