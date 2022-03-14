import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle  = new Bicycle("Bianchi" , "Green" , 0);
    bicycle.printData();
    System.out.print("Enter distance to move: ");
    int dist = scanner.nextInt();
    bicycle.run(dist);
    System.out.println("=================");
    Car car = new Car("Ferrari" , "Red" , 0);
    car.printData();
    
  }
}