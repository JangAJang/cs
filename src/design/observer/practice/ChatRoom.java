package design.observer.practice;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Room{
    private List<Reader> roomMembers;
    private List<Message> messages;

    public ChatRoom() {
        roomMembers = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void getMessage(Message message){
        messages.add(message);
        System.out.println( "message added :: " + message.toString());
        notifyObservers();
    }

    @Override
    public void addMemberInRoom(Reader reader) {
        if(roomMembers.contains(reader)) return;
        roomMembers.add(reader);
    }

    @Override
    public void removeMemberInRoom(Reader reader) {
        roomMembers.remove(reader);
    }

    @Override
    public void notifyObservers() {
        roomMembers.forEach(Reader::update);
    }

    @Override
    public List<Message> getUpdate() {
        return messages;
    }
}
