package day14;

import java.util.NoSuchElementException;

// Queue 구현. 추가, 삭제 : O(1)
public class ListQueue<E> {
  private Node<E> front, rear;
  private int size;

  public ListQueue(){
    front=rear=null;
    size=0;
  }

  public boolean isEmpty() {
    return size==0;
  }

  public void offer(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if (size == 0) {
      front = newNode;
    } else {
      rear.setNext(newNode);
    }
    rear = newNode;
    size++;
  }

  public E poll(){
    if (size == 0) {
      throw new NoSuchElementException();
    }
    Node<E> temp = front;
    E retItem = temp.getItem();
    front = temp.getNext();
    temp = null;
    size--;
    if (size == 0) {
      rear = null;
    }
    return retItem;
  }
}
