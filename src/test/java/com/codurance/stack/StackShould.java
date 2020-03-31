package com.codurance.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Implement a Stack class with the following public methods:
//void push(Object object)
//Object pop()
//Stack should throw an exception if popped when empty.

public class StackShould {
  @Test
  void push_adds_an_object_to_the_stack() {
    MyStack myStack = new MyStack();
    Object object = new Object();

    myStack.push(object);

    assertEquals(object, myStack.pop());
  }

  @Test
  void pop_returns_the_last_object() {
    MyStack myStack = new MyStack();
    Object object = new Object();
    Object object2 = new Object();
    myStack.push(object);
    myStack.push(object2);

    assertEquals(object2, myStack.pop());
  }

  @Test
  void pop_throws_exception_if_popped_when_empty() {
    MyStack myStack = new MyStack();

    assertThrows(InvalidOperation.class, () -> {
      myStack.pop();
    });
  }
}
