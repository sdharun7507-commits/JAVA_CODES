public class students{
    public static void main(String[]args){
        String[] name={"dharun","arun","anbu","akash"};
        int[][] mark={{60,79,98,76,60},{54,87,98,80,57},{86,96,86,97,95},{94,74,47,76,86},{78,76,74,79,55}};
        
        for(int i=0;i<name.length;i++)
        {
            System.out.println("Name="+name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.println(mark[i][j]+" ");
                total+=mark[i][j];
            }
            System.out.println("total:"+total);
            System.out.println("Average:"+(total/5)+"%");
            System.out.println();
        }
    }
}
