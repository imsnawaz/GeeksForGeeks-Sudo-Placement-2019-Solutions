/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseWordsInAGivenString {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for(int t_i=0;t_i<t;t_i++){
		    String[] s = br.readLine().split("\\.");
		    for(int i =s.length-1;i>0;i--)
		        sb.append(s[i]+".");
		    sb.append(s[0]+"\n");
		}
		System.out.println(sb);
	}
}