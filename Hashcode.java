public class Hashcode {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name="Aditya";
        s1.age=28;
        System.out.println(s1.name);

        Student1 s2  = new Student1();
        s2.name="Aditya";
        s2.age=28;
        System.out.println(s2.name);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1.getClass().getName());
        System.out.println(s1 instanceof Student1);
//        System.out.println(s3 instanceof  Student1);



    }
}

class Student1 {
    String name;
    int age;


}

