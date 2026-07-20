import java.util.*;
public class evenElementsInArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements in a array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            {
                System.out.print("Enter the "+(i+1)+"element:");
                arr[i]=sc.nextInt();
            }
        }
            System.out.println("Even elements are :");
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    System.out.println(arr[i]+" ");
                }
            }
        
    }
}
