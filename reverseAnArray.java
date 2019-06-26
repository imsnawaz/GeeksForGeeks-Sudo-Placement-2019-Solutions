/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseAnArray {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int t_i =0;t_i<t;t_i++){
		    int n = Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String s = br.readLine();
		    String ele[] = s.trim().split("\\s+");
		    int i;
		    for(i=0;i<n;i++)
		        a[i]=Integer.parseInt(ele[i]);
		    StringBuffer sb = new StringBuffer();
		    for(i=n-1;i>=0;i--)
		        sb.append(a[i]+" ");
		    System.out.println(sb);
		}
	}
}