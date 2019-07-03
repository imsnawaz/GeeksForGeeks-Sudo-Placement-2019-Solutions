/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class palindromeString {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int t_i=0;t_i<t;t_i++){
		    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		    int n = Integer.parseInt(br.readLine());
		    char[] s = br.readLine().toCharArray();
		    for(char c:s){
		        if(hm.containsKey(c))
		            hm.put(c,hm.get(c)+1);
		        else
		            hm.put(c,1);
		    }
		    int count=0;
		    for(int i:hm.values())
		        if(i%2==1)
		            count++;
		    String res = (count>1)? "No":"Yes";
		    System.out.println(res);
		}
	}
}