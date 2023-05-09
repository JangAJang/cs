package design.observer.practice.observer;

import design.observer.practice.subject.Message;
import design.observer.practice.subject.Reader;

import java.util.List;

public interface Room {

    void addMemberInRoom(Reader reader);
    void removeMemberInRoom(Reader reader);
    void notifyObservers();
    List<Message> getUpdate();
}
