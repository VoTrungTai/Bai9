
package Overloading;
public class students {

         int id;
    String name;
    students(int i, String n){
        id = i;
        n = name;
    }
    void display(){System.out.println(id+""+name);}
    public static void main(String[] args) {
        students e1 = new students(111,"Karan");
        students e2 = new students(222,"Aryan");
        e1.display();
        e2.display();
    }
    
}
