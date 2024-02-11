public class AirConditionerOnCommand implements Command {
    private Airconditioner ac;

    public AirConditionerOnCommand(Airconditioner ac) {
        this.ac = ac;
    }

    public void executeOn() {
        ac.on();
        ac.setTemp(25); // Set temperature to 25 degrees Celsius when turning on the AC
    }

    public void executeOff() {
        ac.off();
    }
}
