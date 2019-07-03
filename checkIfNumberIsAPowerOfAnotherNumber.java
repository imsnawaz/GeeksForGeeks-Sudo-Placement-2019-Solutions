/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class checkIfNumberIsAPowerOfAnotherNumber {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for(int t_i=0;t_i<t;t_i++){
		    String[] xy = br.readLine().trim().split("\\s+");
		    int x = Integer.parseInt(xy[0]);
		    long y = Long.parseLong(xy[1]);
		    String s;
		    if(y==1)
		        s = "1\n";
		    else if(x==1)
		        s="0\n";
		    else{  
		        long rem=0;
		        while(y>1){
		            rem = y%x;
		            y/=x;
		        }
		        s = (rem==0)? "1\n":"0\n";
		    }
		    sb.append(s);
		}
		System.out.println(sb);
	}
}