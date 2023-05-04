package design.observer.example;

import design.observer.example.observer.Observer;
import design.observer.example.observer.TopicSubscriber;
import design.observer.example.subject.Topic;

public class ObserverExampleMain {

    public static void main(String[] args) {
        Topic topic = new Topic();
        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);
        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("amumu is OP champion!!");
    }
}
