//program to remove/delete elements in linkedlist

import java.util.*;            
class Delete_Linkedlist
{  
public static void main(String args[])
{
//creation of linkedlist
 LinkedList<String> L1=new LinkedList<>(); 
L1.add("one");
L1.add("two");
L1.add("three");
L1.add("four");
L1.add("five");

//print linkedlist named L1
System.out.println(L1);
//removing or deleting elements from L1
 L1.remove();
 L1.remove("two");
L1.remove(2);
L1.removeFirst();
L1.removeLast();

 //printing new updated linkedlist L1
System.out.println(L1);
}}





















