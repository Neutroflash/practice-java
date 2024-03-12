public class Droid {
    String name;
    int battery;

    public Droid(String droidName, int batteryLevel) {
        name = droidName;
        battery = batteryLevel;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        battery = battery - 10;
    }

    public void energyReport() {
        System.out.println("Battery: " + battery);
    }

    public void energyTransfer(Droid selectDroid) {
        System.out.println("Exchanges battery between " + name + " and " + selectDroid.name);
        int tempBattery = battery;
        battery = selectDroid.battery;
        selectDroid.battery = tempBattery;
    }

    public String toString() {
        return "Hello, I’m the droid: " + name;
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey", 100);
        Droid Sam = new Droid("Sam", 70);
        System.out.println(Codey);
        System.out.println(Sam);
        Codey.performTask("clean");
        Sam.performTask("play");
        Codey.energyReport();
        Sam.energyReport();
        Codey.energyTransfer(Sam);
        Codey.energyReport();
    }
}