/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class immediateSmallerElement {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int t_i=0;t_i<t;t_i++){
		    int n = Integer.parseInt(br.readLine());
		    int a[]= new int[n];
		    String arr = br.readLine();
		    String ele[]=arr.trim().split("\\s+");
		    int i;
		    for(i =0;i<n;i++)
		        a[i]=Integer.parseInt(ele[i]);
		    for(i=0;i<n-1;i++){
		        if(a[i]>a[i+1])
		            a[i]=a[i+1];
		        else
		            a[i]=-1;
		    }
		    a[i]=-1;
		    StringBuffer sb = new StringBuffer();
		    for(i =0;i<n;i++)
		        sb.append(a[i]+" ");
		    System.out.println(sb);
		}
	}
}