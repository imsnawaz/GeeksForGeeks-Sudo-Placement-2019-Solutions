import java.util.*;
import java.io.*;
class Solution {
    public int countDigits(int n){
        if(n==0)
            return 1;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
	public boolean isValidIP(String s){
	    String[] pb = s.split("\\.");
	    if((s.charAt(s.length()-1)=='.') || pb.length!=4)
	        return false;
	    for(int i =0;i<4;i++){
	        int len = pb[i].length();
	        if(len>3)
	            return false;
	        if(pb[i]=="0")
	            continue;
	        int n=0,flag=0;
	        try{
	            n = Integer.parseInt(pb[i]);
	        }
	        catch(Exception e){
	            flag=1;
	        }
	        if(flag ==1 || countDigits(n)!=len || n>255)
	            return false;
	    }
	    return true;
	}
}
public class validateAnIPAdress {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
			String s = sc.next();
			Solution obj = new Solution();
			
			if(obj.isValidIP(s))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}