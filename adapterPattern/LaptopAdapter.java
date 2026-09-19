package adapterPattern;

public class LaptopAdapter implements RemoteControllerFunction {

    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String powerOn() {
        return "Laptop power is on.";
    }

    @Override
    public String powerOff() {
        return "Laptop power is off.";
    }

    @Override
    public String pressPlusButton() {
        return "Laptop volume or brightness increased.";
    }

    @Override
    public String pressMinusButton() {
        return "Laptop volume or brightness decreased.";
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }

}