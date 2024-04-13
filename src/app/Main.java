package app;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        SensorDisplay display = new SensorDisplay();
        sensor.addObserver(display);

        sensor.setState(0);

        for (int i = 1; i <= 5; i++) {
            int temperature = i;
            sensor.setState(temperature);
        }
    }
}
