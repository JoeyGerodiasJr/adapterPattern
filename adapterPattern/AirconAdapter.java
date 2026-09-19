package adapterPattern;

public class AirconAdapter implements RemoteControllerFunction {
    private AirCon airCon;

    public AirconAdapter(AirCon airCon){
        this.airCon = airCon;
    }

    @Override
    public String powerOn() {
        return airCon.turnOn();
    }

    @Override
    public String powerOff() {
        return airCon.turnOff();
    }

    @Override
    public String pressPlusButton() {
        return airCon.tempUp();
    }

    @Override
    public String pressMinusButton() {
        return airCon.tempDown();
    }
    @Override
    public String plugIn() {
    return "Air conditioner is plugged into the power outlet.";
    } 
}
