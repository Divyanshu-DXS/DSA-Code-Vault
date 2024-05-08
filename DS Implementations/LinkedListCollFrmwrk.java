import java.util.*;
/*
 * this set of code shows major and most commonly used operatons on Linked list
 * using the collectoin framework
 * For implementation and building a LinkedList from scratch please refer to 
 * "LinkedListImplementation.java" file. 
 */
public class LinkedListCollFrmwrk {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        // few common operatons on LinkedLists
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        System.out.println(list);
        list.addFirst("Item First");
        System.out.println(list);
        list.add("test placement");
        System.out.println(list);
        System.out.println(list.size());
        list.addLast("last element");
        System.out.println(list);
        System.out.println(list.size());
        // we can use list.get(int index) to get a value at a particular index in the linked list
        System.out.println("Element at the first index in list is : " + list.get(0));
        System.out.println("Element at the last index in list is : " + list.get(list.size()-1));

        //Iterating a LinkedList using forEach 
        System.out.println("Printing list using iteration");
        for (String str : list) {
            System.out.println(str);
        }        
        
        // removing elements from list 
        System.out.println("deleting first element now");
        list.removeFirst();
        System.out.println(list);

        System.out.println("deleting last element now");
        list.removeLast();
        System.out.println(list);

        System.out.println("deleting element from a certain index");
        list.remove(2);
        System.out.println(list);
    }
}
