import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n number:");
        int n=sc.nextInt();
        System.out.print("enter the m number:");
        int m=sc.nextInt();
        //int n=5;
        // m=10;
        pat(n); 
        pat(m);
       // pat(3);
       // pat(4);
    }
    static void pat(int k)
    { 
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
}
