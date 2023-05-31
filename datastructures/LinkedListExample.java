package com.ramaguru.amrita.cys.jpl.datastructures;

import java.util.LinkedList;


public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> u21cys = new LinkedList<>();

        u21cys.add("CB.EN.U4CYS22031");
        u21cys.add("CB.EN.U4CYS22032");
        u21cys.add("CB.EN.U4CYS22033");
        u21cys.add("CB.EN.U4CYS22034");
        u21cys.add("CB.EN.U4CYS22035");

        // Print the contents of the LinkedList
        System.out.println(u21cys);

        // Call the new method
        processLinkedList(u21cys);
    }

    /**
     * A new method to demonstrate processing of the LinkedList.
     *
     * @param list the LinkedList to process
     */
    public static void processLinkedList(LinkedList<String> list) {
        // Perform some processing on the LinkedList
        // For example, let's remove the first element
        if (!list.isEmpty()) {
            String removedElement = list.removeFirst();
            System.out.println("Removed element: " + removedElement);
        }

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + list);
    }
}