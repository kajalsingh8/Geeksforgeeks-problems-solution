//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        int carry=0;
        Node ahead=null,ans=null;
        Node n1=reverseList(num1);
        Node n2=reverseList(num2);
        while(n1!=null || n2!=null || carry!=0){
            int s=0;
            if(n1!=null){    
                s+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                s+=n2.data;
                n2=n2.next;
            }
            s+=carry;
            carry= s/10;
            Node sum=new Node(s % 10);
            if(ahead==null){
                ahead=sum;
                ans=sum;
            }
            else{
                ans.next=sum;
                ans=ans.next;
            }
        }
        ahead= reverseList(ahead);
        while(ahead!=null && ahead.data==0){
            ahead=ahead.next;
        }
        return ahead;
    }
    static Node reverseList(Node head){
        Node curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}











//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends