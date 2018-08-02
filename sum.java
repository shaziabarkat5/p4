import java.util.*;
public class um {

	public static void main(String[] args) {
		int result=0, a1;
		Scanner a= new Scanner(System.in);
		a1= a.nextInt();
		a.close();
		for(int i=1;i<=a1;i++)
		{
			result += i; 
		}
		System.out.println(result);
	}

}
