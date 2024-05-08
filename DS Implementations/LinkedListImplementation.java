class LinkedListImplementation {

    Node head;
    // variable to keep track of the size of a linkedlist
    int size;

    LinkedListImplementation(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        //initializing LinkedList
        public Node(String data) {
            this.data = data;
            this.next = null; // <-- Whenever a node is created initially this makes sure it points to null
            size++;
        }
    }


    // adding a node
    public void addFirst(String data){
        Node newNode = new Node(data);
        // corner case : if the list is empty
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // adding a node to the last
    public void addLast(String data){
        Node newNode = new Node(data);
        // corner case : if the list is empty
        if(head == null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // deleting from a Linked list (deleting first element)
    public void deleteFirst(){
        // corner case : if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    // deleting from a Linked list (deleting last element)
    // traverse upto the second last node and point its .next to null 
    public void deleteLast(){
        // corner case : if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        // corner case : if there is just 1 element in the linked list
        size--;
        if(head.next==null){
            head=null;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode.next!=null){
            prevNode=currNode;
            currNode=currNode.next;           
        }
        prevNode.next=null;
        
    }


    // printing the Linked List
    public void printLL(){
        // corner case : if the list is empty
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode=head;
        // traversing linked list
        while(currNode!=null){
            System.out.print(currNode.data + " --> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        
        LinkedListImplementation list = new LinkedListImplementation();
        
        list.printLL();
        System.out.println();
        list.addFirst("Item 1");
        list.addFirst("Item 2");
        list.addFirst("Item 3");
        list.printLL();
        System.out.println("Size of your linked list is: "+ list.getsize());
        /* notice that upon printing this linked list, Item 3 is added to the head 
        and hence is at the very fron t of the linked list */
        list.addFirst("Item First");
        list.addLast("Item Last");
        list.printLL();
        System.out.println("Size of your linked list is: "+ list.getsize());
        list.deleteFirst();
        list.deleteLast();
        list.printLL();
        System.out.println("Size of your linked list is: "+ list.getsize());
    }
}