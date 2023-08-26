public class LinkedList<T> {
    Node head;
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }

    public void insertAtBeginning(T val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }

    }

    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void insertAtPos(int pos,T val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<=pos-1;i++){
            temp = temp.next;
            if(temp==null){
                throw new IllegalArgumentException("Invalid pos"+pos);
            }
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

    public void deleteAtPos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }

    public void getIndex(T val){
        Node temp=head;
        int got=0;
        int count=0;
        while(got==0){
            if(temp.data==val)
            {
                got++;
                System.out.print(count);
            }
            else{
                temp=temp.next;
                count++;
            }

        }

    }

    public void update(int pos,T val){
        Node temp = head;
        for(int i=1;i<=pos;i++){
            temp=temp.next;
        }
            temp.data=val;
    }

    public void deleteAtEnd(){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public int getLength(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }

    public void insertAtEnd(T val){
        Node newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<getLength();i++){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void reverse(){
        Node current = head;
        Node prev = null;
        Node next = head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }




}
