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

        // New devices
        Laptop laptop = new Laptop();
        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        Refrigerator refrigerator = new Refrigerator();
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        // Use RemoteControllerFunctio
        RemoteControllerFunction refrigeratorRc = refrigeratorAdapter;
        System.out.println("New device controls:");
        System.out.println(refrigeratorRc.powerOn());
        System.out.println();

        // Use PowerOutlet
        PowerOutlet laptopOutlet = laptopAdapter;
        PowerOutlet refrigeratorOutlet = refrigeratorAdapter;
        PowerOutlet smartphoneOutlet = smartphoneAdapter;
        System.out.println("Plugging devices into the power outlet:");
        System.out.println(laptopOutlet.plugIn());
        System.out.println(refrigeratorOutlet.plugIn());
        System.out.println(smartphoneOutlet.plugIn());
    }
}
