package app;

class SensorDisplay implements Observer {
    @Override
    public void update(int temperature, int weight, String color) {
        System.out.println("Температура: " + temperature + " градусів, Вага: " + weight + " г, Колір: " + color);
    }
}