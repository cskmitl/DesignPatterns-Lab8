public class NoCommand implements Command {
    public void executeOn() {
        System.out.println("No command is assigned to this slot");
    }

    public void executeOff() {
        System.out.println("No command is assigned to this slot");
    }
}
