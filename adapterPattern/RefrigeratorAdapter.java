package adapterPattern;

public class RefrigeratorAdapter implements RemoteControllerFunction {

    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String powerOn() {
        return "Refrigerator power is on.";
    }

    @Override
    public String powerOff() {
        return "Refrigerator power is off.";
    }

    @Override
    public String pressPlusButton() {
        return "Refrigerator cooling increased.";
    }

    @Override
    public String pressMinusButton() {
        return "Refrigerator cooling decreased.";
    }

    @Override
    public String plugIn() {
        return refrigerator.startCooling();
    }

}