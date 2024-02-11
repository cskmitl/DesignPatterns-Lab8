import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

// ConcreteSubject
class FootballScore implements Subject {
    private List<Observer> observers;
    private String score;

    public FootballScore() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }
}
