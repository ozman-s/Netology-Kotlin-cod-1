package ru.netology;

class JavaParent {}
class JavaChild extends JavaParent {}
class JavaGenericPair<A, B> {
  private A first;
  private B second;
  // constructor + get/set
  public JavaGenericPair(A first, B second) {
    this.first = first;
    this.second = second;
  }
  public A getFirst() {
    return first;
  }
  public void setFirst(A first) {
    this.first = first;
  }
  public B getSecond() {
    return second;
  }
  public void setSecond(B second) {
    this.second = second;
  }
}

public class Main {
  public static void main(String[] args) {
    JavaGenericPair<JavaChild, JavaChild> child = new JavaGenericPair<>(new JavaChild(), new JavaChild());
    JavaGenericPair<? extends JavaParent, ? extends JavaParent> parent = child; // !так можно
    // но из parent можно только читать (причём JavaParent):
    JavaParent first = parent.getFirst();
    // а вот писать нельзя (даже JavaChild):
//    parent.setFirst(new JavaChild());
  }
}

