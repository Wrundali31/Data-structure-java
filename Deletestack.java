import java.util.*;
class Deletestack
{
public static void main(String args[])
{
Stack<String>S1=new Stack<>();
S1.push("10");
S1.push("20");
S1.push("30");
System.out.println(S1);
String x;
x=S1.peek();
System.out.println(x);
S1.pop();
x=S1.peek();
System.out.println(x);

}

}