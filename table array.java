public class students{
    public static void main(String[]args){
        String[] name={"dharun","arun","anbu","akash","dhaya"};
        int[][] mark={{60,79,98,76,60},{54,87,98,80,57},{86,96,86,97,95},{94,74,47,76,86},{78,76,74,79,55}};
        System.out.println("Name\tTamil\tEnglish\tMaths\tscience\tsocial\tavg");
        
        for(int i=0;i<name.length;i++)
        {
            System.out.print(name[i]+"\t");
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.print(mark[i][j]+"\t");
                total+=mark[i][j];
            }
            System.out.println(total/5);
            System.out.println();
        }
    }
}
