public class StaticTheory {

    /*  static keyword in Java - for memory management
    *   We can use this word with Variable, method, blocks and nested classes
    *
    *
    *  static keyword belongs to the class than an instance of the class.
    *
    *
    1. Variable
    *  common properties of all objects
    * E.G. college name, employee company name
    *  get the memory only one time class loading
    *
    2.Method
    * static keyword with method
    * belongs to the class rather than the object of a class
    * access static data member and can change the value of it
    * but cannot use non-static data member or call non-static method directly
    * this and super cannot be used in static context
    *
    3.Block
    * it is used to initialize teh static data member
    *  it is executed before the main method at the time of classloading
    *  class A{
    * // this below is static block
    * // it will execute first
    *  static {
    * System.out.println("static block");
    *
    * public static void main(String args[]){
    * System.out.println("hello");
    * }
    *
    * }
    * }
    *
    4.Nested class
    * A class can have static nested
    *  class which can be accessed by using outer class name.
    *
    *
    * Questions:
    *
    * Why is the Java main method static?
    *
    * Ans) It is because the object is not required to call a static method.
    * If it were a non-static method, JVM creates an object first then call main()
    * method that will lead the problem of extra memory allocation.
    *
    *
    * Can we execute a program without main() method?
    *
    * Ans) No, one of the ways was the static block, but
    * it was possible till JDK 1.6. Since JDK 1.7,
    * it is not possible to execute a Java class without the main method.
    * */
}
