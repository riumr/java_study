package day14;

public class StackTest {
  public static void main(String[] args) {
    MyStack<Integer> myStack = new MyStack();

    myStack.push(10);
    myStack.push(20);
    myStack.push(30);

    System.out.println(myStack.peek());

    while (!myStack.empty()){
      System.out.println(myStack.pop());
    }
  }
}
