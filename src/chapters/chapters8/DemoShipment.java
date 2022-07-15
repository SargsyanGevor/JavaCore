package chapters.chapters8;

public class DemoShipment {

    public static void main(String[] args) {
method();
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.5);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);


        double vol;

        vol = shipment1.volume();
        System.out.println("shiplment1 i cavaly havasar e: " + vol);
        System.out.println("shiplment1 i qashy havasar e: " + shipment1.weight);
        System.out.println("araqman arjeqy havasar e: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("shiplment2 i cavaly havasar e: " + vol);
        System.out.println("shiplment2 i qashy havasar e: " + shipment2.weight);
        System.out.println("araqman arjeqy havasar e: $" + shipment2.cost);

    }
  static void  method(){

      System.out.println("2+2= " +(2+2));
    }

}
