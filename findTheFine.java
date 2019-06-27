/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class findTheFine {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int t_i=0;t_i<t;t_i++){
		    String n_d=br.readLine();
		    String vals[]=n_d.trim().split("\\s+");
		    int n = Integer.parseInt(vals[0]);
		    int d = Integer.parseInt(vals[1]);
		    int check = (d%2==0)? 1:0;
		    int sum=0;
		    String cars = br.readLine();
		    String dates = br.readLine();
		    String c[]=cars.trim().split("\\s+");
		    String date[]=dates.trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        int ele=Integer.parseInt(c[i]);
		        if(ele%2==check)
		            sum+=Integer.parseInt(date[i]);
		    }
		    System.out.println(sum);
		}
	}
}