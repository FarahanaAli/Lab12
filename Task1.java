public class Task1 {
	public static void main(String[] args)
	{
		
		int a = 5, b=11;
		boolean flag = true;
		//number1//
		if(a<=b)
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		
		//number2//

		if((a=5)>=b)
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number3//
		if(a<b/2)
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number4//
		if(a!=b)
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number5//
		if(!(a==b))
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number6//
		if((a < b) || (a > b) )
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number7//
		if ((a < b) && (a > b) )
			System.out.println("The expression is true");
		else 
System.out.println("The expression is false ");
		//number8//
		if(((a >= b) || !flag) && flag)
			System.out.println("The expression is true");
		else 
			System.out.println("The expression is false ");
	}

}
