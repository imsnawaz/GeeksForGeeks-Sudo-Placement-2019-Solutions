/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseArrayInGroups {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int t_i =0;t_i<t;t_i++){
		    String n_k = br.readLine();
		    String cons[] = n_k.trim().split(" ");
		    int n = Integer.parseInt(cons[0]);
		    int k = Integer.parseInt(cons[1]);
		    int a[]=new int[k];
		    int d=Math.abs(n-k);
		    int b[]=new int[d];
		    String s = br.readLine();
		    String ele[] = s.trim().split(" ");
		    int i,j;
		    List<Integer> li = new ArrayList<Integer>();
		    List<Integer> li2 = new ArrayList<Integer>();
		    for(i=0;i<k;i++)
		        li.add(Integer.parseInt(ele[i]));
		    for(j=0;j<d;j++)
		        li2.add(Integer.parseInt(ele[i++]));
		    StringBuffer sb = new StringBuffer();
		    for(i=k-1;i>=0;i--)
		        sb.append(li.get(i)+" ");
		    for(i=d-1;i>=0;i--)
		        sb.append(li2.get(i)+" ");
		    System.out.println(sb);
		}
	}
}