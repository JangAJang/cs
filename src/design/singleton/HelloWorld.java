package design.singleton;

import java.util.Objects;

public class HelloWorld {
    public static void main(String[] args){
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(Objects.equals(a, b));
    }

}

class Singleton{
    private static class singleInstanceHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}
