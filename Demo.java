public class Demo {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name="Aditya";
        s1.age=28;

        Student1 s2 = new Student1();
        s2.name="Aditya";
        s2.age=28;


//        System.out.println(s1.toString());
//        System.out.println(s1);

        System.out.println(s1.equals(s2));
    }


}

class Student {
    String name;
    int age;
    @Override
    public String toString(){
        return (name + " " + age);
    }



}
