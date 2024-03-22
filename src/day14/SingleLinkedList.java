package day14;

import java.util.NoSuchElementException;

// singleLinkedList. 노드로 구성됐다. 빈 공간이 존재 않음
// 자료 추가 삭제 : O(1). 자료 탐색 : O(N)
public class SingleLinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SingleLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  // 탐색, 삽입, 삭제 연산 구현
  public int size() {
    return size;
  }

  public E get(int index) {
    return getNode(index).getItem();
  }

  private Node<E> getNode(int index) {
    Node<E> x = head;
    for (int i = 0; i < index; i++) {
      x = x.getNext(); // 연결된 요소를 찾아나간다
    }
    return x;
  }

  public void addFirst(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if (size == 0) {
      tail = newNode;
    } else {
      newNode.setNext(head);
    }
    head = newNode;
    size++;
  }

  public void addLast(E newItem) {
    Node<E> newNode = new Node(newItem, null);
    if (size == 0) {
      head = newNode;
    } else {
      tail.setNext(newNode); // tail에 newNode 추가
    }
    tail = newNode;
    size++;
  }

  // 삭제
  public E remove() {
    if (size == 0) {
      throw new NoSuchElementException();
      // tail = null;
    }
    Node<E> temp = head; // 맨 앞의 요소를 지운다
    E retItem = temp.getItem();
    head = temp.getNext(); // 다음 요소를 head로 가져온다
    temp = null;
    size--;
    if (size == 0) {
      tail = null;
    }
    return retItem;
  }

  public E remove(int index) {
    if (size == 0) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      return remove();
    }
    Node<E> prevNode = getNode(index - 1);
    Node<E> temp = prevNode.getNext();

    E retItem = temp.getItem();
    if (temp==tail) {
      temp = prevNode; // 한 칸씩 당긴다.
    }
    prevNode.setNext(prevNode.getNext()); // 이전 요소의 다음 요소를 당긴다.
    temp=null;
    size--;
    return retItem;
  }
}


class Node<E> {
  private E item;
  private Node<E> next;

  public Node(E item, Node<E> node) {
    this.item = item;
    this.next = node;
  }

  public E getItem() {
    return item;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setItem(E item) {
    this.item = item;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }

}