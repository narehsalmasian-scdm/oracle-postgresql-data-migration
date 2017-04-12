package test;

import java.util.ArrayList;

public class MyArray<E> extends ArrayList<E>{
  
  
  public String toString() {
    String result = "";
    for(Object o : this){
      result = result + String.valueOf(o);
    }
    return result;
  } 
}
