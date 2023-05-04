package design.observer.practice;

import java.time.LocalDateTime;

public class Message {

    private String sentMember;
    private String message;
    private LocalDateTime localDateTime;

    public String toString(){
        return sentMember + " : " + message + " (" + localDateTime.toLocalDate() + ")";
    }

    public Message(String sentMember, String message, LocalDateTime localDateTime) {
        this.sentMember = sentMember;
        this.message = message;
        this.localDateTime = localDateTime;
    }

    public static Message create(String sentMember, String message){
        return new Message(sentMember, message, LocalDateTime.now());
    }
}
