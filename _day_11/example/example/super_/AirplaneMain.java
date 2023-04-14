package example.super_;

public class AirplaneMain {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane("OZ109");

        for (int i = 0; i < 8; i++) {
            superSonicAirplane.fly();
        }
        superSonicAirplane.showStatus();

        System.out.println("----------------------");

        for (int i = 0; i < 3; i++) {
            superSonicAirplane.fly();
        }
        superSonicAirplane.showStatus();


    }
}
