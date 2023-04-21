package design.factory.simpleFactory;

import java.time.LocalDateTime;

public class ItemFactory {
    public static Item getItem(String itemType, int price, String name){
        if("book".equalsIgnoreCase(itemType)){
            return new Book(name, LocalDateTime.now(), price);
        }
        if("movie".equalsIgnoreCase(itemType)){
            return new Movie(name, LocalDateTime.now(), price);
        }
        if("album".equalsIgnoreCase(itemType)){
            return new Album(name, LocalDateTime.now(), price);
        }
        return new DefaultItem(name, LocalDateTime.now(), price);
    }
}
