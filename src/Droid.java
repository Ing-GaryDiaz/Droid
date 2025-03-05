public class Droid {
    //Instance fields
    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;

    }

    public String toString() {
        return "The Droid name is: " + name;
    }

    public void energyReport() {
        System.out.println("Current battery level: " + batteryLevel + "%");
    }

    public void performTask(String task) {
        System.out.println(name + " Is performing: " + task);
        batteryLevel -= 10;
        energyReport();
    }

}
