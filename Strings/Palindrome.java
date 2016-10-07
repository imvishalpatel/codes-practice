import java.io.*;

class Palindrome {
	public static void main (String[] args) {
	   String s = "A man, a plan, a canal: Panama";
	   s = s.trim();
	   int len = s.length();
	   int l = 0;
	   int r = len-1;
	   
	   if(s == null || s == ""){
	       System.out.println("it is palindrome");
	   }
	   
	   boolean flag = true;
	   while(l<r){
	       if(!Character.isLetterOrDigit(s.charAt(l))){
	           l++;
	           continue;
	       }
	       if(!Character.isLetterOrDigit(s.charAt(r))){
	           r--;
	           continue;
	       }
	       
	       if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r)))
	       {
	           l++;
	           r--;
	       }else{
	           flag = false;
	           break;
	       }
	       
	   }
	   
	   if(flag){
	       System.out.println("String is palindrome");
	   } else{
	       System.out.println("String is not palindrome");
	   }
	}
	
}