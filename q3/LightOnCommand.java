public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void executeOn() {
        light.on();
    }

    public void executeOff() {
        light.off();
    }
}
