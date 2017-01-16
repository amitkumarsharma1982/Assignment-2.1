package assignment;

/**
 *
 * @author IE003395
 */
public class AssignmentTwoDotTwo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] intarrayone = new int[10];
        int[] intarraytwo = new int[10];
        int counter=0;
        int counter1=0;
        //Step1 Fill it with only prime numbers
        for (int i=1;i<=100;i++){
            if(counter<=9){
             int j,flag=0;
            if(i==1 || i==2) {
             intarrayone[i-1]=i;
            }
            else{
            for(j=2; j<=i/2; ++j)
                {
                // condition for nonprime number
                    if(i%j==0)
                         {
                            flag=1;
                            break;
                        }
                }
            }
                if (flag==0){
                 intarrayone[counter]=i;
                 counter+=1;
                 }
              
            }else break;  
            System.out.print(" "+i);
        }
        for (int j=intarrayone.length;j>0;j--){
            intarraytwo[counter1]=intarrayone[j-1];
            counter1+=1;
        }
        System.out.println("================================");
        System.out.print("Print values of First Array : ");
        for (int j=0;j<intarrayone.length;j++){
        System.out.print(intarrayone[j]+" ");
        }
        System.out.println("================================");
        System.out.print("Print values of Second Array : ");
        for (int k=0;k<intarraytwo.length;k++){
        System.out.print(intarraytwo[k]+" ");
        }
}
}
