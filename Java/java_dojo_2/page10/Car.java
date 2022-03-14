class Car{
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;
  Car(String name , String color){
    System.out.println("【Car Info】");
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
    System.out.println("Fuel: " + this.fuel +"L");
  }
  public void run(int Run){
    System.out.println("Moving " + Run +"km ...");
      if(Run<=this.fuel){
      this.distance += Run;
      
      System.out.println("Distance: " + this.distance +"km");
      this.fuel-=this.distance;
      System.out.println("Fuel:" + this.fuel +"L");
    }
    else
    {
      System.out.println("Not enough fuel");
      System.out.println("Distance: " + this.distance +"km");
      System.out.println("Fuel:" + this.fuel +"L");
      
    }
  }
  public void charge(int Charge){
    System.out.println("Adding "+ Charge +"L ...");
    if(Charge<=0){
      System.out.println("No fuel added");
       
        System.out.println("Fuel: "+ this.fuel +"L"); 
      
    }
    else if(Charge>=100){
        System.out.println("Tank now full");
        this.fuel = 100;
         System.out.println("Fuel: "+ this.fuel +"L"); 
      
        
    }
    else{
      this.fuel+=Charge;
       System.out.println("Fuel: "+ this.fuel +"L"); 
      
    }
    
     
      
      
    
  }
}