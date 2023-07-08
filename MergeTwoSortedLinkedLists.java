

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode tempNode = new SinglyLinkedListNode(0);
        SinglyLinkedListNode currNode = tempNode;
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                currNode.next = head1;
                head1 = head1.next;
            } else {
                currNode.next = head2;
                head2 = head2.next;
            }
            currNode = currNode.next;
        }
        
        if(head1 == null){
            currNode.next = head2;
        }
        
        if(head2 == null){
            currNode.next = head1;
        }
        
        return tempNode.next;
    }

