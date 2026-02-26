public class Demo {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//            if(i>5) break;
//        }

//        int p=7;
//        int i;
//        for( i=2;i<p;i++){
//            if(p%i==0) {
//                System.out.println("number is not prime");
//                break;
//            }
//
//        }
//        if(i==p){
//            System.out.println("number is prime");
//        }

        for(int i=1;i<=10;i++){
            if(i%2==0) {
//                System.out.print(i);
                continue;
            }
            System.out.println(i);


        }
    }
}
