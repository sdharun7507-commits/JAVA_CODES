import java.util.*;
class main{
    public static void main(String[]args){
        int k=1;
        int t=1;
for(int i=2;i<5;i++)
{
    k=t;
    for(int j=0;j<4-t;j++)
    {
        System.out.print(" ");
    }
    for(int j=0;j<i;j++)
    {
        System.out.print(k++);
    }
    t++;
    System.out.println();
}
    }    
}
