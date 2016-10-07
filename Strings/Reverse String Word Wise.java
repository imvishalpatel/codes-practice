import java.io.*;
/*
	given a string, reverse it to word wise
	for example
	intput : the sky is blue 
	output : blue is sky the
*/
class ReverseString {
	public static void main (String[] args) {
	   String s = "the       sky     is blue";
	   s = s.trim();
	   s = s.replaceAll("\\s+"," ");
	   int len = s.length();
	   String tmp="";
	   int start=0;
	   for(int i=0;i<len;i++){
	       if(i == len-1){
	           tmp += new StringBuilder(s.substring(start,i+1)).reverse().toString();
	       }else if(s.charAt(i) == ' '){
	           tmp += new StringBuilder(s.substring(start,i)).reverse().toString();
	           tmp+=" ";
	           start = i+1;
	       }
	   }
	   System.out.print(new StringBuilder(tmp).reverse());
	}
	
}