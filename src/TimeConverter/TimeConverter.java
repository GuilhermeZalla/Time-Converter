package TimeConverter;
 import java.util.Scanner;
   public class TimeConverter{
   
     public static void Time(){ 
       
       Scanner input = new Scanner(System.in);
    
         int value, hour, minute, second;
        
            System.out.print("Enter the amount of seconds: ");
            value = input.nextInt();
         
               hour = value/3600;
               value = value - (hour * 3600);
               minute = value/60;
               second = value - ( minute * 60);
         
            System.out.print(hour+":"+minute+":"+second+"\n");
  }
     
     public static void main(String[] args){
         
          System.out.println(" ----------------------- \n"
                            +"|    Time Converter     |\n"
                            +" ----------------------- \n");        
                                       Time();
   }        
  }       