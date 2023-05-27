package Tables;
import java.util.Scanner;
//import org.op[en]
import java.util.Scanner.*;

public class Dynamictable {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String userid= "poonjagoonnja";
	String passwrd= "661059";
	System.out.println("enter userid =");
	String enteruser= sc.next();
	System.out.println("enter password=");
	String ennterpass= sc.next();
	
	if(userid.equals(enteruser))
	{
		System.out.println("user or password is correct");
	}
	else 
	{
		System.out.println("incorrect user or pssword");
	}
}
}
