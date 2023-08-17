package com.driver;

public class Main {
  public static void main(String []args){
    Product p = new Product();
    int i = p.product(4, 8);
    int j = p.product(5, 10, 15);
    double k = p.product(2L, 4L);
  }
}
