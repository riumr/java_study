package day14;

import java.util.EmptyStackException;

public class MyStack<E> {
  private Node<E> top;
  private int size;

  public MyStack() {
    top = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public void push(E i) {
    Node<E> newNode = new Node(i, null);
    newNode.setNext(top); // newNode의 다음은 null(node를 생성)
    top = newNode; // 기존 null이었던 top에는 newNode 할당
    size++;
  }

  public boolean empty() {
    return size == 0;
  }

  public E peek() {
    if (empty()) {
      throw new EmptyStackException();
    }
    return top.getItem();
  }

  public E pop() {
    if (size == 0) {
      throw new IndexOutOfBoundsException();
    }
    Node<E> temp = top;
    E retItem = temp.getItem(); // temp에 할당한 top 가져와 return 한다
    top=top.getNext(); // 기존 top값은 다음 칸의 값으로 바꾼다
    temp = null;
    size--;
    return retItem;
  }
}

