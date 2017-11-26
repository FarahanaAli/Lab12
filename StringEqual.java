public class StringEqual
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      if (str2.equals(str3))
         System.out.println("The strings are equal");
      else
         System.out.println("The strings are not equal");
      
      
   int result1=  str1.compareTo(str2);
   		if (result1==0)
   		 System.out.println("The strings are equal");
   		if (result1<0)
   		 System.out.println("String one is larger than string 2");
   		else
   		 System.out.println("String two is larger than string 1");
   			
   			
    int result2=  str1.compareTo(str3);
    if (result2==0)
  		 System.out.println("The strings are equal");
  		if (result2<0)
  		 System.out.println("String one is larger than string 3");
  		else
  		 System.out.println("String three is larger than string 1");
  			
  			
    int result3=  str2.compareTo(str3);
    if (result3==0)
  		 System.out.println("The strings are equal");
  		if (result3<0)
  		 System.out.println("String 2 is larger than string 3");
  		else
  		 System.out.println("String 3 is larger than string 2");
  			
  			
   }
}
