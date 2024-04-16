import java.util.*;
public class Remove {
public static void main(String[] args){
 System.out.println("Name: Shaibin K B");
  System.out.println("Reg. No: 23MCA050");
  System.out.println("Date: 15/04/2024");
LinkedList<String> L=new LinkedList<>();
L.add("JAVA");
L.add("PYTHON");
L.add("CSS");
L.add(0,"PROGRAMING LANGUAGE");
System.out.println(L);
L.remove("CSS");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
