/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reversingTheVowels {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		char[] vowels = "aeiouAEIOU".toCharArray();
		ArrayList<Character> v = new ArrayList<Character>();
		for(char c:vowels)
		    v.add(c);
		for(int t_i =0;t_i<t;t_i++){
		    String s = br.readLine();
		    StringBuffer sb = new StringBuffer(s);
		    int check = s.length()-1;
		    for(int i =0;i<s.length();i++){
		        char inc=sb.charAt(i);
		        if(!v.contains(inc))
		            continue;
		        for(int j =check;j>i;j--){
		            char outc = sb.charAt(j);
		            if(!v.contains(outc))
		                continue;
		            else{
		                sb.setCharAt(j,inc);
		                sb.setCharAt(i,outc);
		                check=j-1;
		                break;
		            }
		        }
		    }
		    System.out.println(sb);
		}
	}
}