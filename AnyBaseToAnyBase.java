import java.util.*;
class Sol
{
public static int getValue(int n,int b1,int b2)
{
int dec=anyBaseToDecimal(n,b1);
int dn=decimalToAnyBase(dec,b2);
return dn;
}
public static int anyBaseToDecimal(int n,int b1)
{
int rv=0;
int p=1;
while(n>0)
{
int dig=n%10;
n=n/10;
rv+=dig*p;
p=p*b1;
}
return rv;
}
public static int decimalToAnyBase(int n,int b2)
{
int rv=0;
int p=1;
while(n>0)
{
int dig=n%b2;
n=n/b2;
rv+=dig*p;
p=p*10;
}
return rv;
} 
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int b1=sc.nextInt();
int b2=sc.nextInt();
int d=getValue(n,b1,b2);
System.out.println(d);
}
}