package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());

        System.out.println();

        //press button up
        System.out.println(tvRc.pressPlusButton());
        System.out.println(airConRc.pressPlusButton());
        System.out.println(speakerRc.pressPlusButton());

         // Plug in New Devices
        Laptop laptop = new Laptop();
        RemoteControllerFunction laptopRc = new LaptopAdapter(laptop);
        Refrigerator refrigerator = new Refrigerator();
        RemoteControllerFunction refrigeratorRc = new RefrigeratorAdapter(refrigerator);
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        RemoteControllerFunction smartphoneRc = new SmartphoneAdapter(smartphoneCharger);
        System.out.println();
        System.out.println("Plugging devices into the power outlet:");
        System.out.println(laptopRc.plugIn());
        System.out.println(refrigeratorRc.plugIn());
        System.out.println(smartphoneRc.plugIn());
    }
}
