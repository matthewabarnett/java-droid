public class Droid {
    String name;
    int batteryLevel;

    
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    
    public String toString() {
        return "Hello, I'm droid: " + name;
    }

    
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10; // 
        System.out.println("Battery level: " + batteryLevel + "%");
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey"); // Sets name

        System.out.println(Codey.name);
        System.out.println(Codey);

        Codey.performTask("dancing"); 
    }
}
