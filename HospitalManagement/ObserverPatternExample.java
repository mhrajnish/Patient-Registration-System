import java.util.ArrayList;  
import java.util.List;  

interface Observer {  
    void update(String message);  
}  

class ConcreteObserver implements Observer {  
    private String name;  

    public ConcreteObserver(String name) {  
        this.name = name;  
    }  

    @Override  
    public void update(String message) {  
        System.out.println(name + " received update: " + message);  
    }  
}  

class Subject {  
    private List<Observer> observers = new ArrayList<>();  

    public void addObserver(Observer observer) {  
        observers.add(observer);  
    }  

    public void notifyObservers(String message) {  
        for (Observer observer : observers) {  
            observer.update(message);  
        }  
    }  
}  
