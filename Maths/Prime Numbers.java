import java.io.*;
/*
	given n, print all prime numbers to the n
*/
class Prime {
	public static void main (String[] args) {
	    int n = 99999;
	  
	    boolean flag[] = new boolean[n+1];
	   
	    
	    for(int i=2;i*i<=n;i++){
	        if(flag[i] == false){
	            for(int p=i*2;p<=n;p+=i){
	                flag[p]=true;
	            }
	        }
	    }
	    
	    for(int i=2;i<=n;i++){
	        if(flag[i]==false)
	            System.out.println(i);
	    }
	}
	
}