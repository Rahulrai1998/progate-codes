class Car{
  private String name;
  private String color;
  private int distance = 0;
  Car(String name , String color , int distance){
    System.out.println("【Car Info】");
    this.name = name;
    this.color = color;
    this.distance = distance;
    
  }
  public String getName(){
    return this.name;
    
  }
  public String getColor(){
    return this.color;
  }
  public void printData(){
    System.out.println("Name: " + this.name );
    System.out.println("Color: " + this.color );
    System.out.println("Distance: "+ this.distance +"km");
   
    
    
    
  }
  public void run(int Run){
    this.distance += Run;
    System.out.println("Moving " + this.distance +"km ...");
    System.out.println("Distance: " + this.distance +"km");
    
  }
}