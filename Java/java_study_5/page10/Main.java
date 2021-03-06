class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

    Car car = new Car("Ferrari", "Red");
    // Set the owner of car to person1 using the setOwner method
    car.setOwner(person1);
    
    Bicycle bicycle = new Bicycle("Bianchi", "Green");
    bicycle.setOwner(person2);
    // Set the owner of bicycle to person2 using the setOwner method 
    

    System.out.println("【Car Info】");
    car.printData();
    System.out.println("-----------------");
    System.out.println("【Car Owner Info】");
    car.getOwner().printData();
    
    
    
    // Get the owner of car using the getOwner method,
    // and use printData to output the owner information
    

    System.out.println("=================");
    System.out.println("【Bicycle Info】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("【Bicycle Owner Info】");
    bicycle.getOwner().printData();
    
    // Get the owner of bicycle using the getOwner method,
    // and use printData to output the owner information
    
    
  }
}
