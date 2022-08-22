import java.util.Scanner;
class Max
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter three numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	String max=(a>b && a>c)?"a is max":(b>c)?"b is max":"c is max";
	System.out.println(max);
}
}