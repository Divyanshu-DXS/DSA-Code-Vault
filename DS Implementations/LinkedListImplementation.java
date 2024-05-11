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

    // Reversing a Linked List using iteration 
    /*
     * In this approach we use three pointers to access three nodes.
     * a previous node pointer, a current node pointer and a next node pointer
     * we keep travering the list and keep switching the node connections from the next node to prev node on the curr node
     * as soon we reach the null node we return from the loop and then finally assign null to the head's .next 
     */
    public void reverseListIteration(){
        // corner case where the list is either empty or has just one element in that case the list in itself is reversed 
        if(head == null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currNode = prevNode.next;
        while(currNode !=null){
            // Initializeing the nextNode in the list as the loop progresses 
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            // updating other nodes to traverse in a list
            prevNode=currNode;
            currNode= nextNode;
            
        }
        head.next=null;
        head = prevNode;

    }

    // Reversing a LinkedList using recursion 
    /*
     * this approach uses recursion
     * all the nodes are provided as head elements and when the recursion is backtracking we switch the conenction amongst nodes 
     * it is very important to ponder on the statement that is [ head.next.next = head ] 
     * this statment by itself reverses the connection between nodes and then we make head.next as null 
     */
    public Node reverseListRecursion(Node head){
        //corner case for empty list and single element. 
        if(head==null||head.next==null){
            return head;
        }
        Node newHead = reverseListRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    // emptying a linked list
    public void clearList(){
        if(head==null){
            System.out.println("List is already empty");
        }
        head=null;
        System.out.println("All elements have been deleted, list is now empty");
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
        
        // LinkedListImplementation list = new LinkedListImplementation();
        
        // list.printLL();
        // System.out.println();
        // list.addFirst("Item 1");
        // list.addFirst("Item 2");
        // list.addFirst("Item 3");
        // list.printLL();
        // System.out.println("Size of your linked list is: "+ list.getsize());
        // /* notice that upon printing this linked list, Item 3 is added to the head 
        // and hence is at the very fron t of the linked list */
        // list.addFirst("Item First");
        // list.addLast("Item Last");
        // list.printLL();
        // System.out.println("Size of your linked list is: "+ list.getsize());
        // list.deleteFirst();
        // list.deleteLast();
        // list.printLL();
        // System.out.println("Size of your linked list is: "+ list.getsize());

        System.out.println("Attempting to reverse the list given below");
        LinkedListImplementation list2 = new LinkedListImplementation();
        list2.addFirst("4");
        list2.addFirst("3");
        list2.addFirst("2");
        list2.addFirst("1");
        list2.printLL();
        System.out.println("Reversing the list: ");
        list2.reverseListIteration();
        list2.printLL();
        System.out.println();

        System.out.println("Attempting reversing a linkedlist using recursion");
        list2.clearList();
        
        System.out.println("Original List is: ");
        list2.addFirst("4");
        list2.addFirst("3");
        list2.addFirst("2");
        list2.addFirst("1");
        list2.printLL();
        System.out.println("Linked list has now been reversed using recursion");
        list2.head=list2.reverseListRecursion(list2.head);
        list2.printLL();

    }
}