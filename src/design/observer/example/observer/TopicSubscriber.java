package design.observer.example.observer;

import design.observer.example.subject.Subject;

public class TopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String message = (String)topic.getUpdate(this);
        System.out.println(name + ":: get Message >> " + message);
    }
}
