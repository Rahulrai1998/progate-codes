class Main {
  public static void main(String[] args) {
    // Pass "doctor" as the job
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0,"doctor");
    person1.printData();
    // Pass "teacher" as the job
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0,"teacher");
    person2.printData();
    System.out.println("----------------------");
    person1.setJob("veterinarian");
    System.out.println("Changed the job of person1 to "+ person1.getJob() +".");
    // Change the job of person1 to "veterinarian"
    
    
    // Output "Changed the job of person1 to ________."
    
    
    person1.printData();
  }
}
