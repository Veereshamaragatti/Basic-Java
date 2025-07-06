public class LinkedList{
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int index,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        if(index==0){
            addFirst(data);
            return;
        }
        int i=0;
        while(i < index-1){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
             System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int search(int data){
       Node temp = head;
       int i = 0;
       while(temp!=null){
        if(temp.data == data){
            return i;
        }
        temp = temp.next;
        i++;
       } 
       System.out.println("The key Element is not found");
       return -1;
    }
    public void reverse(){
        Node prev = null;
        Node cur = tail = head;
        Node next;

        while(cur != null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head = prev;
    }
    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        } 
        if(n == sz){
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    // public void deleteNthfromEnd(){
    //     int sz = 0;
    //     Node temp = head;
    //     while(temp!=null){
    //         temp = temp.next;
    //         sz++;
    //     }
    //     if(n==sz){
    //         head = head.next;
    //         return;
    //     }


    // }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addFirst(0);
        ll.print();
        ll.addMiddle(1, 7);
        ll.print();
        System.out.println("the number of elements are ->"+ll.size);
        ll.removeLast();
        System.out.println("the number of elements are ->"+ll.size);
        System.out.println("the element is in "+ll.search(1)+" positon");
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}