package com.driver;

public class Main {

   public  static class product{
     
      public int product(int x, int y) {
            return x * y;
        }
     public int product(int x, int y, int z){
             return x * y * z;
     }
     public double product(double x, double y){
             return x * y;
     }
   }

  public static void main(String [] args){

    product p = new product();

    System.out.println("Product of 2 integers: " + p.product(4, 5));         
    System.out.println("Product of 3 integers: " + p.product(2, 3, 4));    
    System.out.println("Product of 2 doubles: " + p.product(3.5, 2.5));
  }
     

}
