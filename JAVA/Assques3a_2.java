import java.util.*;
class Assques3a_2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius to Find the Volume and Surface Area of the Sphere");
double r=sc.nextDouble();
double v=1.33*3.14159*r*r*r;
double a=4*3.14159*r*r;
System.out.println("Volume of the Sphere is "+v);
System.out.println("Surface Area of the Sphere is "+a);
}}