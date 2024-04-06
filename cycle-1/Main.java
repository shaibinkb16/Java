public class Product
{
int pcode;
String pname;
int price;
public static void main(String[] args)
{
int small;
Product p1=new Product(1,'Apple',100);
Product p2=new Product(2,'Orange',200);
Product p3=new Product(3,'Mango',50);
if(p1.price<p2.price)
{
if(p1.price<p3.price)
{
small=p1.price;
System.out.println(small+"is the smallest");
}
else
{
small=p3.price;
System.out.println(small+"is the smallest");
}
}
else{
if(p2.price<p3.price)
{
small=p2.price;
System.out.println(small+"is the smallest");
}
else
{
small=price.p3;
System.out.println(small+"is the smallest");
}
}
}
}


