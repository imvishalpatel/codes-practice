import java.io.*;

class GFG {
	public static void main (String[] args) {
	    StringBuilder s = new StringBuilder("abcdefg");
	    int offset = 10;
	    int len = s.length();
	    offset = offset % len;
	    
	    String tmp = s.substring(len-offset);
	    int end = len-1;
	    for(int i=len-offset-1;i>=0;i--){
	        s.replace(end,end+1,String.valueOf(s.charAt(i)));
	        end--;
	    }
	    for(int i=0;i<tmp.length();i++)
	    {
	        s.replace(i,i+1,String.valueOf(tmp.charAt(i)));
	    }
	    System.out.println(s);
	}
}