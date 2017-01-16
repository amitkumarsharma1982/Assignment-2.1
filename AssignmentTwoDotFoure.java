package assignment;

import java.util.Scanner;

/**
 *
 * @author IE003395
 */
public class AssignmentTwoDotFoure{
    
    int calenMonth,calenDays,calenYear ;

    public static void main(String[] args) {
        // TODO code application logic here
        
    int[] calenMonth = {1,2,3,4,5,6,7,8,9,10,11,12};
    int[] calenDays = new int[12];
    String userDate;
    int date,month,year;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a date in MM-DD-YYYY format :");
  
    userDate = sc.nextLine();
    int firstOccr= userDate.indexOf("-");
    int lastOccr= userDate.lastIndexOf("-");   
    System.out.println("firstOccr : "+firstOccr+" lastOccr : "+lastOccr);
    month =Integer.parseInt(userDate.substring(0, firstOccr));
    date =Integer.parseInt(userDate.substring(firstOccr+1, lastOccr));
    year =Integer.parseInt(userDate.substring(lastOccr+1,userDate.length()));
    System.out.println("month : "+month+" date : "+date+" year : "+year);
    
    for (int k=0;k<month;k++){
        if((k+1)!=month)
        {if (calenMonth[k] == 4 || calenMonth[k] == 6 || calenMonth[k] == 9 || calenMonth[k] == 11)
        {
            if(k==0)   
            calenDays[k] = 30;    
            else    
            calenDays[k] = calenDays[k-1]+30;
        }
        else if (calenMonth[k] == 2 && year%4==0) 
        {
           if(k==0)   
            calenDays[k] = 29;    
            else    
            calenDays[k] = calenDays[k-1]+29;
        }
        else if (calenMonth[k] == 2 && year%4!=0) 
        {
           if(k==0)   
            calenDays[k] = 28;    
            else    
            calenDays[k] = calenDays[k-1]+28;
        }
        else {
            if(k==0)   
            calenDays[k] = 31;    
            else    
            calenDays[k] = calenDays[k-1]+31;
        }}else{
         if(k==0)   
            calenDays[k] = date;    
            else    
            calenDays[k] = calenDays[k-1]+date;
        }
     }
        System.out.println("================================");
        for (int k=0;k<month;k++){
        System.out.print("In Month : "+calenMonth[k]+" there are "+calenDays[k]+" days");
        System.out.println("");
        }
}
}
