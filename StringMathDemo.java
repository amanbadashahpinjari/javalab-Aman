public class StringMathDemo {
public static void main(String[]arg) {
    String str1="Rajput";
    String str2="Rajnandini";

    String str3=str1.concat(""+str2);

    System.out.println("concatenation:"+str3);
    System.out.println("Length of str1:"+str1.length());
    System.out.println("character at index 1:"+str1.charAt(1));
    System.out.println("Substration of str2 (0-3):"+str2.substring(0,3));
    System.out.println("Equals? str1 and str2:"+str1.equals(str2));
    System.out.println("Upprecase str1:"+str1.toUpperCase());


    double a=23.0;
    double b=7.7;

    System.out.println("square root of a:"+Math.sqrt(a));
    System.out.println("a raised to b:"+Math.pow(a,b));
    System.out.println("max of a and b:"+Math.max(a,b));
    System.out.println("min of a and b:"+Math.min(a,b));
    System.out.println("Random number(0-1):"+Math.random());
    System.out.println("Random number(10-20):"+ (10 +Math.random()*(20-10)));
    System.out.println("Random number(1-100):"+ (1 +Math.random()*(100-1)));
    System.out.println("Ceil of b:"+Math.ceil(b));
    System.out.println("Floor of b:"+Math.floor(b));
    System.out.println("Round of b:"+Math.round(b));

}   
}