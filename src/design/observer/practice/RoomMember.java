package design.observer.practice;

public class RoomMember implements Reader{

    private String name;
    private Room room;

    public RoomMember(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    @Override
    public void update() {
        System.out.println(name + " got messages");
        for(Message message : room.getUpdate()){
            System.out.println(message.toString());
        }
    }
}
