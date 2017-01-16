package assignment;

/**
 *
 * @author IE003395
 */
public class AssignmentTwoDotOne{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] intarray = new int[10];
        for (int i=1;i<=10;i++){
            intarray[i-1]=i;
        }
        System.out.print("Even numbers stored in array are :");
         for (int j=0;j<intarray.length;j++){
            if(intarray[j]%2==0){
                System.out.print(intarray[j]+" ");
                }
    }
}
}
