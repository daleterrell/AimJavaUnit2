public class Assignment2_3 {

    public static void main(String[] args) {           
      System.out.println("kilograms \t| \tpounds");
      System.out.println("-----------------+-----------");
      
      for (int i = 1; i <= 100; i ++) { 
        String output = String.format("%03d", i);
        
        System.out.println(" " + i + " " + (2.2 * i) + " ");

      }
      
    } 
  } 
