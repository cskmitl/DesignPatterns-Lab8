public class SmartRemoteControl {
    private Command[] slots;

    public SmartRemoteControl() {
        slots = new Command[6];
        for (int i = 0; i < slots.length; i++) {
            slots[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < slots.length) {
            slots[slot] = command;
        } else {
            System.out.println("Invalid slot number");
        }
    }

    public void pressOnButton(int slot) {
        if (slot >= 0 && slot < slots.length) {
            slots[slot].executeOn();
        } else {
            System.out.println("On button No command is assigned to this slot");
        }
    }

    public void pressOffButton(int slot) {
        if (slot >= 0 && slot < slots.length) {
            slots[slot].executeOff();
        } else {
            System.out.println("Off button No command is assigned to this slot");
        }
    }
}
