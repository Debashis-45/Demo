import java.util.*;
class Exc1{
public static void main(String args[]){
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the full marks of one Subject");
double Full=Sc.nextDouble();

System.out.println("Enter the Mark of Physics:");
int p=Sc.nextInt();

System.out.println("Enter the Mark of Mathematics:");
int m=Sc.nextInt();

System.out.println("Enter the Mark of Chemistry:");
int c=Sc.nextInt();

System.out.println("Enter the Mark of Botany:");
int b=Sc.nextInt();

System.out.println("Enter the Mark of Zoology:");
int z=Sc.nextInt();

double obtainedmark= ((p+m+c+b+z)/(Full*5))*100;
System.out.println("Percentage : " +obtainedmark);

}}