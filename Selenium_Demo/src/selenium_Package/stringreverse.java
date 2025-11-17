package selenium_Package;

public class stringreverse 
{
	public static String reverseString(String originalStr) {
        String reversedStr = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + originalStr.charAt(i);

	public static void main(String[] args) 
   {
		String myString = "Hello";
        String reversed = reverseString(myString);
        System.out.println("Original string: " + myString);
        System.out.println("Reversed string: " + reversed); // Output: olleH 
   }

}
