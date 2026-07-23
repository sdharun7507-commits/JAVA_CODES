public class main{
    public static void main(String[]args){
     //int g=1;
     for(int i=1;i<5;i++)
     {
         for(int j=1;j<5-i;j++)
         {
            System.out.print("  ");
         }
         for(int j=1;j<2*i;j++)
         {
            System.out.print(" *");
            //g++;
         }
         System.out.println();
    }
}
}
