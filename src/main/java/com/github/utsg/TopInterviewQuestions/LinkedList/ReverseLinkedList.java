package com.github.utsg.TopInterviewQuestions.LinkedList;

import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
