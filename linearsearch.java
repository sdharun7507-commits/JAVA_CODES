import java.util.*;
public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int[]mark={70,90,80,60,50};
        int num=sc.nextInt();
        for(int i=0;i<mark.length;i++)
        {
            if(mark[i]==num)
            {
                System.out.print("Number is found");
                return;
            }
        }
        System.out.println("Number is not found");
    }
}
