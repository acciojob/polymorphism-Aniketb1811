package com.driver;

public class Main {
  public static void main(String []args){
    Product p = new Product();
    p.Product();
    p.Product(4, 8);
    p.Product(5, 10, 15);
    p.Product(2l, 4l);
  }

  public void Product{
    public int Product(int x, int y){
      return x+y;
    }

    public int Product(int x, int y, int z){
      return x+y+z;
    }

    public double Product(double x, double y){
      return x+y;
    }
  }
}
