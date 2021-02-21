import java.util.Scanner;
import java.io.*;


public class Roman{



	public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);
      
      String number;
      Boolean run = true;
       
      while(run){
         run = false;    
         System.out.print("Input Roman Numeral:  ");
         number = cin.next();
         number = number.toUpperCase();
      
         romanType r1 = new romanType(number);
         System.out.println(r1.getNum() );
      
            
         System.out.print("Run Again:  ");
         number = cin.next();
         number = number.toUpperCase();
         if(number.equals("YES") || number.equals("TRUE") || number.equals("Y")|| number.equals("1") || number.equals("T") ){
            run = true;
         }
      }
      
   
   }
   
   
   
}


class romanType {
   
   String RomanLetters = "IVXLCDM";
   String rnum;
   int dnum;
   
   public romanType(String r){
   rnum = r;
   dnum = 0;
   }
   
   public int getNum(){
   char lastLetter = ' ';
   int as;
   for(int i = rnum.length() - 1; i >= 0; i--){
   
      as = 1;
      if(RomanLetters.indexOf(lastLetter) > RomanLetters.indexOf(rnum.charAt(i)) ){
      as = -1;
      }
   
      if(rnum.charAt(i) == 'M'){
      dnum += 1000 * as;
      }else if(rnum.charAt(i) == 'D'){
      dnum += 500 * as;
      }else if(rnum.charAt(i) == 'C'){
      dnum += 100 * as;
      }else if(rnum.charAt(i) == 'L'){
      dnum += 50 * as;
      }else if(rnum.charAt(i) == 'X'){
      dnum += 10 * as;
      }else if(rnum.charAt(i) == 'V'){
      dnum += 5 * as;
      }else if(rnum.charAt(i) == 'I'){
      dnum += 1 * as;
      }
      
      lastLetter = rnum.charAt(i);
   }
   return dnum;
   }
   
   
}