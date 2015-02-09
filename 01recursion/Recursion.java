import java.util.*;
public class Recursion{

  public String name() {
    return "Li,David";
  }

  public int fact(int n){
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n <= 1){
      return 1;
    }
    return n * fact(n - 1);
  }

  public int fib(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public double sqrt(double n){
    if (n < 0){
      throw new IllegalArgumentException();
    }
    if (n == 0){
      return 0;
    }
    double guess = n / 2.0;
    return sqrtguess(n, guess);
  }
  public double sqrtguess(double n, double guess){    
    double nextguess = (n/guess + guess)/2;
    if (guess != nextguess){
      return sqrtguess(n, nextguess);
    }else{
      return guess;
    }
  }
  
}