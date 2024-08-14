public class MyClass {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
      // count variable is  static and gets incremented by one each time a new object of counter class is created
        // first it will initialize  get 0, then count first object 1, other object 2, third object 3 and then printed
        System.out.println(c1.count);
        System.out.println(c2.count);
        // static method

        Counter.increment();
        Counter.increment();
        System.out.println(Counter.count);
    }
}
