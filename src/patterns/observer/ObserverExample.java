package patterns.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Channel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}



public class ObserverExample {
    public static void main(String[] args) {
        Channel agilChannel = new Channel();
        Channel inclusvaChannel = new Channel();

        Observer guilherme = new Subscriber("Guilherme");
        Observer wander = new Subscriber("Wander");

        inclusvaChannel.subscribe(guilherme);
        agilChannel.subscribe(wander);

        agilChannel.notifySubscribers("Aula 1 da Ágil disponível!");
        inclusvaChannel.notifySubscribers("Aula 1 da Inclusiva disponível!");

        inclusvaChannel.unsubscribe(guilherme);

        agilChannel.notifySubscribers("Aula 2 da Ágil disponível!");
        inclusvaChannel.notifySubscribers("Aula 2 da Inclusiva disponível");

    }
}
