public class SinglyLinkedList {
  public Node head;
  public SinglyLinkedList() {
    head = null;
  }
  public SinglyLinkedList(Node firstNode) {
    head = firstNode;
  }
  public void Remove() {
    Node runner = head;
    while(runner.next.next != null) {
      runner = runner.next;
    }
    runner.next = null;
  }
  public void PrintValues() {
    Node runner = head;
    while(runner.next != null) {
      System.out.print(" " + runner.value + ", ");
      runner = runner.next;
    }
    System.out.print(" " + runner.value);
  }
  public void Add(int value) {
    Node newNode = new Node(value);
    if(head == null) {
      head = newNode;
    }
    else {
      Node runner = head;
      while(runner.next != null) {
        runner = runner.next;
      }
      runner.next = newNode;
    }
  }
}
