class LinkedListImplementation {
    class Node{
        String data;
        Node next;

        //initializing LinkedList
        public Node(String data) {
            this.data = data;
            this.next = null; // <-- Whenever a node is created initially this makes sure it points to null
        }
    }

    Node head;

    // adding a node
    public void addFirst(String data){
        Node newNode = new Node(data);
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

    // printing the Linked List
    public void printLL(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " --> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        
        LinkedListImplementation list = new LinkedListImplementation();
        
        list.printLL();
        list.addFirst("Item 1");
        list.addFirst("Item 2");
        list.addFirst("Item 3");
        list.printLL();
    }
}