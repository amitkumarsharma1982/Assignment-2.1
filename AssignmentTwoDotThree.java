package assignment;

/**
 *
 * @author IE003395
 */
public class AssignmentTwoDotThree{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] calenMonth = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] calenDays = new int[12];
        int year=2017;
       
        for (int k=0;k<calenMonth.length;k++){
        if (calenMonth[k] == 4 || calenMonth[k] == 6 || calenMonth[k] == 9 || calenMonth[k] == 11)
        {
            calenDays[k] = 30;
        }
        else if (calenMonth[k] == 2 && year%4==0) 
        {
            calenDays[k] =  29;
        }
        else if (calenMonth[k] == 2 && year%4!=0) 
        {
            calenDays[k] =  28;
        }
        else 
            calenDays[k] = 31;
        }
        System.out.println("================================");
        for (int k=0;k<calenMonth.length;k++){
        System.out.print("In Month : "+calenMonth[k]+" there are "+calenDays[k]+" days");
        System.out.println("");
        }
}
}
