class student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    
    student(int rollno,String name,String dept,String section,int year)
    {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }
    void display()
    {
        System.out.println("Roll no ="+rollno);
        System.out.println("name ="+name);
        System.out.println("dept ="+dept);
        System.out.println("Section ="+section);
        System.out.println("Year ="+year);
        System.out.println();
    }
}
public class Main{
    public static void main(String[]args){
        student[] students=new student[3];
        student s1 = new student(101,"dharun","ECE","A",4);
        students[0]=s1;
        student s2 = new student(102,"arun","ECE","A",4);
        students[1]=s2;
        students[2] = new student(103,"charlie","EEE","B",3);
        
        for(int i=0;i<students.length;i++)
        {
            students[i].display();
        }
    }
    
 }
