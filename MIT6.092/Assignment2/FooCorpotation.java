public class FooCorporation {
  public static void CalculatePaid(double pay, int hours) {
    if (pay < 8.00) {
     System.out.println("An error occurred,pay must not be less than $8.00"); 
      return ;
    }
    if (hours > 60){
      System.out.println("An error occurred,hours must be less than 60");
      return ;
    }
    System.out.println(40*pay + (hours- 40)*(pay*1.5));
  
  }
  public static void main(String[] args) {
    CalculatePaid(7.5,35);
    CalculatePaid(8.2,47);
    CalculatePaid(10.0,73);
    
  }
}
