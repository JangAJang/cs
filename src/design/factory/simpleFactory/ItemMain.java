package design.factory.simpleFactory;

public class ItemMain {
    public static void main(String[] args){
        Item book = ItemFactory.getItem("book", 8000, "면접을 위한 CS 전공지식노트");
        Item movie = ItemFactory.getItem("movie", 1000, "어바웃 타임");
        Item music = ItemFactory.getItem("album", 3000, "전선을 간다");
        Item cookie = ItemFactory.getItem("cookie", 2500, "내가 만든 쿠키");
        System.out.println(book.getInfo());
        System.out.println(movie.getInfo());
        System.out.println(music.getInfo());
        System.out.println(cookie.getInfo());
    }
}
