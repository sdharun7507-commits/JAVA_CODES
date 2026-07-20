import java.util.*;
public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String[]name={"dharun","arun","adhi","anbu"};
        String n=sc.nextLine();
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(n))
            {
                System.out.print("Name is found");
                return;
            }
        }
         System.out.println("Name is not found");
    }
}
