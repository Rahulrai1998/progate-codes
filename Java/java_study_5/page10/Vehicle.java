abstract class Vehicle {
  private String name;
  private String color;
  protected int distance = 0;
  private Person owner; 
  // Declare the owner instance field
  

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public Person getOwner(){
    return this.owner;
  }
  public void setOwner(Person person){
    this.owner = person;
  }
  // Define the getter for the owner field
  
  
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  
  // Define the setter for the owner field
  

  public void printData() {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + this.distance + "km");
  }

  abstract public void run(int distance);
}
