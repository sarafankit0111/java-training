package Day1;

public class Operators {
    public static void main(String[] args){
//        Operators
        int x = 1000198;
        int y = 133399;
        boolean flag = true;
        int result;

        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(~x);
        System.out.println(!flag);

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        System.out.println(x > y && flag);
        System.out.println(x < y && flag);
        System.out.println(x > y || flag);

        flag = false;

        System.out.println(x > y && x < y++);
        System.out.println(y);

        System.out.println(x < y & x > y--);
        System.out.println(y);

        System.out.println(x < y || x++ > y);
        System.out.println(x);
        System.out.println(x < y | x++ > y);
        System.out.println(x);

        result = (x>y)?x:y;
        System.out.println(result);

    }
}
