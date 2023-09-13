public class IfElse2Program 
{
public static void main (String args[])
{
// find out the largest number from given three numbers
int a=24, b=29, c=10;
if(a>b && a>c)
{
System.out.println(a +"is greater");
}
else if (b>a  && b>c)
{
System.out.println(b +"is greater");
}
else
{
System.out.println(c +"is greater");
}
}
}