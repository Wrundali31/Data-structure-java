//program to delete elements from stack
import java.util.*;
class Delete_stack
{
public static void main(String args[])
{

//creating stack and inserting elements  
Stack<String>S1=new Stack<>();
S1.push("10");
S1.push("20");
S1.push("30");

//print stack
System.out.println(S1);
String x;
x=S1.peek();
System.out.println(x);
S1.pop();
x=S1.peek();
System.out.println(x);

}

}
