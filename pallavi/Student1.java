package pallavi;
public class Student1 {
int a = 10 ; // instance variable
static int b = 20 ; //static variable
void show(){
int c = 30 ; // local variable
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
void display(){
//System.out.println(c);
System.out.println(a);
System.out.println(b);
}
public static void main(String [] args) {
Student1 std = new Student1() ;
std.show();
//std.display();
}
}
