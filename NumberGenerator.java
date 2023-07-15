package com.numbergenerator;
import java.util.Random;
class NumberGenerator{
  public static void main(String[] args){
  //calling  random
Random n = new Random();

//for loop
for(int num = 0; num <= 10; ++num){
  System.out.println(n.nextInt(1000));
}
  
  }
}