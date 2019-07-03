
import java.util.*;
import java.lang.*;
import java.io.*;

class lcmAndGcd {
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for(int t_i =0;t_i<t;t_i++){
		    String[] ab = br.readLine().trim().split("\\s+");
		    long a = Long.parseLong(ab[0]);
		    long b = Long.parseLong(ab[1]);
		    long gcd = gcd(a,b);
		    long lcm = a*b/gcd;
		    sb.append(lcm+" "+gcd+"\n");
		}
		System.out.println(sb);
	}
}