//program to remove/delete elements in linkedlist

import java.util.*;            
class DeleteL
{  
public static void main(String args[])
{
LinkedList<String> L1=new LinkedList<>();
L1.add("one");
L1.add("two");
L1.add("three");
L1.add("four");
L1.add("five");


System.out.println(L1);
L1.remove();
 L1.remove("two");
L1.remove(2);
L1.removeFirst();
L1.removeLast();

System.out.println(L1);
}}





















