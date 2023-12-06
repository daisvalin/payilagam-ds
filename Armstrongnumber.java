class Armstrongnumber
{
public static void main(String[] args)
{
Armstrongnumber am=new Armstrongnumber();
am.find_armstrong(153);
}

void find_armstrong(int num)
{
int n=num;
int a=0;
while(num>0)
{
int rem=num%10; //3 is remainder
a=a+(rem*rem*rem); //add rem cube(3) 
num=num/10;
}
System.out.println(a);
if(a==n)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong");
}
}
}
