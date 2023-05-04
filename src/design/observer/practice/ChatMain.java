package design.observer.practice;

public class ChatMain {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Reader a = new RoomMember("a", chatRoom);
        Reader b = new RoomMember("b", chatRoom);
        Reader c = new RoomMember("c", chatRoom);
        chatRoom.addMemberInRoom(a);
        chatRoom.addMemberInRoom(b);
        chatRoom.addMemberInRoom(c);
        chatRoom.getMessage(Message.create("a", "hi I am A"));
        chatRoom.getMessage(Message.create("b", "hi I am B"));
        chatRoom.getMessage(Message.create("c", "hi I am C"));
        chatRoom.getMessage(Message.create("a", "hi I am A"));
        chatRoom.getMessage(Message.create("a", "hi I am A"));
        chatRoom.getMessage(Message.create("a", "hi I am A"));
    }
}
