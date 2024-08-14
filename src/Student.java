public class Student {

    // properties
    String name;
    int id;
    static String College ="Centennial";


   // method

    // when we use static word in method, we will save memory with use of
    // method we can share this variable with all instances of object.
   public static void changeName() {
       College = "Sheridan";
   }


    public void  display(String name,int id,String college){
        System.out.println("Name " + name +"ID : " + id + "College :" + College);
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
      // first initialize object with reference s1 , it will search with help of constructor variable stored into heap memory
        Student s1 = new Student(123,"Asma");
        // second initialize object with reference s2 , it will search with help of constructor variable stored into heap memory
        Student s2 = new Student(456,"Fayza");

        // it will call the static method which already variable declared and save into method name is "Sheridan" already occupy memory there
        Student.changeName();

        // call with reference of object  to the specific method
        s1.display(s1.name, s1.id, "");
        s2.display(s2.name, s2.id, "");


//        System.out.println("Name is : " + s1.name + " Id is : " + s1.id  );
//        System.out.println("Name is : " + s2.name + " Id is : " + s2.id );

    }
}
