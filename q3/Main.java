public class Main {
    public static void main(String[] args) {
        SmartRemoteControl remote = new SmartRemoteControl();

        Light bedroomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAC = new Airconditioner("Bed Room");

        remote.setCommand(0, new LightOnCommand(bedroomLight));
        remote.setCommand(1, new LightOnCommand(kitchenLight));
        remote.setCommand(2, new AirConditionerOnCommand(bedroomAC));

        System.out.println("slot 0, light Bed Room");
        remote.pressOnButton(0);
        remote.pressOffButton(0);
        System.out.println("--------------------------------");

        System.out.println("slot 1, light Kitchen");
        remote.pressOnButton(1);
        remote.pressOffButton(1);
        System.out.println("--------------------------------");

        System.out.println("slot 2, AC Bed Room");
        remote.pressOnButton(2);
        remote.pressOffButton(2);
        System.out.println("--------------------------------");

        System.out.println("test one unavailable slot, slot 3");
        remote.pressOnButton(3);
        remote.pressOffButton(3);
    }
}
