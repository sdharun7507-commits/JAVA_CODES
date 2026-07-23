class mygrandpa{
    void display()
    {
        System.out.println("my grandpa is farmer");
    }
}
class father extends mygrandpa{
    void show()
    {
        System.out.println("My father is weaver");
    }

}
class me extends mygrandpa{
    void display1()
    {
        System.out.println("I am a student");
    }
}
public class Inheritance{
    public static void main(String[]args){
        me obj = new me();
        obj.display1();
        obj.display();
       
        father dad = new father();
        dad.show();
        obj.display();
    }
}
