package design.observer.example.subject;

import design.observer.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{
    private List<Observer> observers;
    private String message;

    public Topic(){
        observers = new ArrayList<>();
    }

    public void postMessage(String message){
        this.message = message;
        System.out.println("Message sent to Topic : " + message);
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if(observers.contains(observer)) return;
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
}
