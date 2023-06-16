package StringConcepts1;

public class StringMethods {

	public static void main(String[] args) {
		String str  = "This is the string concept ";
		String str1  = "This is ";
		String str2  = "the ";
		String str3 = "all";
		String str4  = "";
		String str5  = "concept";
		String str6  = "of"; 
		String str7  = "string";
		String str8  = "welcome";
		
		System.out.println("Lenght is "+str.length());
		System.out.println("Lenght is "+str.charAt(2));
		System.out.println("concat is"+str.concat("This is  appended string"));
		System.out.println("contains chaecl 1 is "+str.contains("is"));
		System.out.println("contains chaecl 2 is "+str.contains("si"));
		System.out.println("startsWith is "+str.startsWith("This"));
		System.out.println("startswith is "+str.startsWith("is"));    
		System.out.println("endswith is "+str.endsWith("string"));
		System.out.println("endswith is "+str.endsWith("is"));
		System.out.println("check concats are equal:" + str1.equals(str2));
		System.out.println("check concats are equal:" + str1.equals(str3));
		System.out.println("index of o is :" + str.indexOf('o'));
		System.out.println("check if string is empty" + str.isEmpty());
		System.out.println("check if string is empty" + str1.isEmpty());
		System.out.println("Trim the leading and trailing spaces" + str5.trim());
		System.out.println("Replace examples" + str6.replace('r','g'));
		System.out.println("Replace examples" + str.substring('r','g'));
		System.out.println("Replace examples" + str.substring('r','g'));


	}

}
