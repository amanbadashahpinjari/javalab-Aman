public class OperatorsDemo{
    void add(int a,int b) {
        int sum =a+b;
        System.out.println("Addition:"+sum);

    }
    int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {


        byte a=20, b=58;
        int result= a+b;
        System.out.println("Arithmetic Promotion Result: " + result);


        int x=10, y=3;
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));


        OperatorsDemo obj =new OperatorsDemo();
        obj.add( 56, 98);
        int product = obj.multiply(63, 82);
        System.out.println("Multiplication: " + product);
        
    }
}