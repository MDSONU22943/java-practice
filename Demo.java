public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Aditya";
        s1.age=28;


//        System.out.println(s1.toString());
        System.out.println(s1);
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
