package mainPractice;

/**
 * Main description.
 *
 * @author Daniel
 * @version 25/07/2025
 */
public class Main {

  public static void main(String[] args) {
    
    byte byteNumber = 127;
    System.out.println("byteNumber = " + byteNumber);
    System.out.println(Byte.SIZE);

    long longNumber = 2147483648L;

    longNumber += 1;

    System.out.println(longNumber);
    
  }

}
