import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class merge2sorted
{
    Node head;
    void addToTheLast(Node node)
    {
        if(head == null)
            head = node;
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    void printList(Node node)
    {
        while(node!= null)
        {
            System.out.print(node.data+ " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            String nums[] = br.readLine().split(" ");
            int n1 = Integer.parseInt(nums[0]);
            int n2 = Integer.parseInt(nums[1]);
            merge2sorted list = new merge2sorted();
            nums = br.readLine().split(" ");
            int a1 = Integer.parseInt(nums[0]);
            Node head = new Node(a1);
            list.addToTheLast(head);
            for(int i=1;i<n1;i++)
            {
                int a = Integer.parseInt(nums[i]);
                list.addToTheLast(new Node(a));
            }
            merge2sorted list2 = new merge2sorted();
            nums = br.readLine().split(" ");
            int b1 = Integer.parseInt(nums[0]);
            Node head1 = new Node(b1);
            list2.addToTheLast(new Node(b1));
            for(int j=1;j<n2;j++)
            {
                int b = Integer.parseInt(nums[j]);
                list2.addToTheLast(new Node(b));				
            }          
            GfG g = new GfG();
            Node result = g.mergeResult(list.head, list2.head);
            list.printList(result);
            t--;
        }
    }
}
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
        if(node1==null)
            return reverse(node2);
        if(node2==null)
            return reverse(node1);
        if(node1.data>node2.data){
            Node temp= node1;
            node1=node2;
            node2 = temp;
        }
        Node temp1 = node1;
        Node temp2 = node2;
        while(temp1.next!=null){
            while(temp2!=null && temp1.next.data>=temp2.data){
                Node c = new Node(temp2.data);
                c.next = temp1.next;
                temp1.next = c;
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            temp1= temp1.next;
        }
        if(temp2!=null)
            temp1.next = temp2;
        return reverse(node1);
    }
    Node reverse(Node node1){
        Node n = null;
        Node curr = node1;
        Node p = null;
        while(curr!= null){
            n = curr.next;
            curr.next = p;
            p= curr;
            curr=n;
        }
        return p;
    }
}