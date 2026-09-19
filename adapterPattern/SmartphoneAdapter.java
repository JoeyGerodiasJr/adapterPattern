package adapterPattern;

public class SmartphoneAdapter implements RemoteControllerFunction {

    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String powerOn() {
        return "Smartphone charger power is on.";
    }

    @Override
    public String powerOff() {
        return "Smartphone charger power is off.";
    }

    @Override
    public String pressPlusButton() {
        return "Smartphone charging power increased.";
    }

    @Override
    public String pressMinusButton() {
        return "Smartphone charging power decreased.";
    }

    @Override
    public String plugIn() {
        return smartphoneCharger.chargePhone();
    }

}