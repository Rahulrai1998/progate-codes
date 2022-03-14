class Person{
  public static void printData(String firstName , String lastName , int age , double height , double weight){ 
  System.out.println("My name is "+ fullName(firstName , lastName) +".");
 
  System.out.println("I am "+ age + " years old.");
  if(age>=18)
  {
    System.out.println("I am an adult.");
    
  }
  else
  {
    System.out.println("I am not an adult.");
  }
  System.out.println("I am "  + height +"m tall.");
  System.out.println("I weigh "  + weight + " kg.");
  double bmi = bmi(weight , height);
  System.out.println("My BMI is " + Math.round(bmi) + ".");
  if(bmi>=18.5 && bmi<25.0)
  {
    System.out.println("I am healthy!");
    
  }
  else
  {
    System.out.println("I am not healthy.");
  }
  
 }  
  public static String fullName(String firstName , String lastName)
  {
    return firstName + " " + lastName; 
  }
  public static double bmi(double height , double weight){
    return weight/height/height;
    
  }
 
}