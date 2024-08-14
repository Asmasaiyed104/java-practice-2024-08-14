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

        Student s1 = new Student(123,"Asma");
        Student s2 = new Student(456,"Fayza");

        Student.changeName();

        s1.display(s1.name, s1.id, "");
        s2.display(s2.name, s2.id, "");


//        System.out.println("Name is : " + s1.name + " Id is : " + s1.id  );
//        System.out.println("Name is : " + s2.name + " Id is : " + s2.id );

    }
}
