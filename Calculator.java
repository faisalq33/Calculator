public class Calculator {
    int a=10;
    static int b=20;
    static int c=40;
    static int f=30;

    public void  m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void addition(){
        System.out.println("Addition of "+c+" and "+b+" =");
        System.out.println(c + b);
    }
    public static void subtraction(){
        System.out.println("Subtraction of "+c+" and "+f+" =");
        System.out.println(c-f);
    }

        public static void division() {
        int a=2;
        int b=4;
        System.out.println("Division of "+a+" and "+b+" =");
        System.out.println(a/b);
    }

        public static void multiplication() {
            int a=20;
            int b=30;
            System.out.println("Multiplication of "+a+" and "+b+" =");
            System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        String company = "TFL";
        System.out.println(company);
        addition();
        subtraction();
        System.out.println(b);
        division();
        multiplication();
    }
}
