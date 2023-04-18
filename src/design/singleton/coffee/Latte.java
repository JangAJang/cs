package design.singleton.coffee;

public class Latte {
    private final String name = "라떼";
    private final int price = 2_000;

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
