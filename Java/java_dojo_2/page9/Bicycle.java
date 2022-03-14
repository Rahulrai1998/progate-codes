class Bicycle{
  private String name;
  private String color;
  private int distance = 0;
  Bicycle(String name , String color){
    System.out.println("【Bicycle Info】");
    this.name = name;
    this.color = color;
    
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
    System.out.println("-----------------");
    
    
    
  }
  public void run(int Run){
    this.distance += Run;
    System.out.println("Moving " + this.distance +"km ...");
    System.out.println("Distance: " + this.distance +"km");
    
  }
  
}