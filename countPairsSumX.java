import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class countPairsSumX
{
   
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];
             
             for(int i = 0; i < n1; i++)
                 arr1[i] = sc.nextInt();
            
            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];
            
            for(int i = 0; i < n2; i++)
                arr2[i] = sc.nextInt();
                
            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));
            
            int x = sc.nextInt();
            GfG gfg = new GfG();
            System.out.println(gfg.countPairs(head1, head2, x));
        }
    }
}
class GfG
{
    static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
        int count=0;
        for(int i =0;i<head1.size();i++){
            for(int j =0;j<head2.size();j++){
                if((head1.get(i)+head2.get(j))==x)
                    count++;
            }
        }        
        return count;
    }
}
