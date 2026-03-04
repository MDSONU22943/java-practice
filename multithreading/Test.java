package multithreading;

public class Test {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        System.out.println(Thread.currentThread().getName());

        World world = new World();

        world.start();
            for(int i=0;i<10000;i++){
//                System.out.println("Hello");
                System.out.println(Thread.currentThread().getName());
            }
    }
}
