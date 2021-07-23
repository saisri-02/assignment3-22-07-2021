import java.util.*;
public class Validpara
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string : ");
String st=sc.next();
boolean str=isbalance(st);
if(str)
System.out.println("Balanced");
else
System.out.println("Not balanced");
}
static boolean isbalance(String st)
{
if((st==null) || (st.length()%2!=0))
return false;
Stack<Character> stack=new Stack<Character>();
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if((ch=='{')||(ch=='(')||(ch=='['))
stack.push(ch);
else
{
if((ch=='}')||(ch==')')||(ch==']'))
{
if(!stack.isEmpty())
{
char laststr=stack.pop();
if(laststr=='{'&&ch!='}')
return false;
if(laststr=='('&&ch!=')')
return  false;
if(laststr=='['&&ch!=']')
return false;
}
else
{
return false;
}
}
}
}
return stack.isEmpty();
}
}

output:

Enter your string : 
(){}
Balanced