package day14;

import java.util.Stack;

public class CompileTest {
  public static void main(String[] args) {
    String[] p = {"{", "(", ")", "}"};
    Stack<String> compile = new Stack<>();
    String c;
    boolean isClosed = false;
    for (String s : p) {
      if (s.equals("{") || s.equals("(")) {
        compile.push(s);
      } else if (s.equals("}") || s.equals(")")) {
        if (!compile.empty()) {
          c = compile.pop();
          if (s.equals("}")) {
            if (c.equals("{")) {
              isClosed = true;
            }
          }
          if (s.equals("(")) {
            if (c.equals(")")) {
              isClosed = true;
            }
          }
        }
      }
    }
    System.out.println(compile);
    System.out.println(isClosed);
  }
}
