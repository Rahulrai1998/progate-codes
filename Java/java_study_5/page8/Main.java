import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("Ferrari", "Red");
    Bicycle bicycle = new Bicycle("Bianchi", "Green");

    System.out.println("【Car Info】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int carDistance = scanner.nextInt();
    car.run(carDistance);
    // Call the run method and pass carDistance as an argument
    
    
    System.out.println("-----------------");
    System.out.print("Enter amount to refuel: ");
    int litre = scanner.nextInt();
    car.charge(litre);
    
    System.out.println("=================");
    System.out.println("【Bicycle Info】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);
    // Call the run method and pass bicycleDistance as an argument
    
    
  }
}
