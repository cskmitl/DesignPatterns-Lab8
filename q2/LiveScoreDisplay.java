// ConcreteObserver
class LiveScoreDisplay implements Observer {
    public void update(String score) {
        System.out.println("Live result: " + score);
    }
}
