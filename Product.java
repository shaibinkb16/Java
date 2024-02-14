public class Product
{
int pcode;
String pname;
int price;
public Product(int pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}

public static void main(String[] args)
{

System.out.println("Name : Shaibin K B\nRoll.no : 50\nTitle :Product is Greater\nDate : 14/02/2024\n");
int small;
Product p1=new Product(1,"Apple",200);
Product p2=new Product(2,"orange",150);
Product p3=new Product(3,"Mango",100);
if(p1.price<p2.price)
{
if(p1.price<p3.price)
{
small=p1.price;
System.out.println(small+" is the smallest");
}
else
{
small=p3.price;
System.out.println(small+" is the smallest");
}
}
else{
if(p2.price<p3.price)
{
small=p2.price;
System.out.println(small+" is the smallest");
}
else
{
small=p3.price;
System.out.println(small+" is the smallest");
}
}
}
}


