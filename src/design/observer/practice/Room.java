package design.observer.practice;

import java.util.List;

public interface Room {

    void addMemberInRoom(Reader reader);
    void removeMemberInRoom(Reader reader);
    void notifyObservers();
    List<Message> getUpdate();
}
