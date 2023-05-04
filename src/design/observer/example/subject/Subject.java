package design.observer.example.subject;

import design.observer.example.observer.Observer;

public interface Subject {

    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
