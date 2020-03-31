package com.codurance.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

  private final List<Object> myStackList;

  public MyStack() {
    myStackList = new ArrayList<>();
  }

  public void push(Object object) {
    myStackList.add(object);
  }


  public Object pop() {
    int size = myStackList.size();

    if (size == 0){
      throw new InvalidOperation();
    }

    Object object = myStackList.remove(size - 1);
    return object;
  }
}
