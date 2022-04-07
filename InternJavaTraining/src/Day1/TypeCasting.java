package Day1;

public class TypeCasting {
    public static void main(String[] args){
//        Internal Type Casting(lower to higher)
        int length = 103;
        float quantity;
        float width = 5;
        quantity = length/width;
        System.out.println(quantity);

        char letter = 's';
        int value;
        value = letter;
        System.out.println(value);

//        External Type Casting(higher to lower)
        int number = 30002;
        float rate = 30.09f;
        int rise;


//        rise = number/rate;
        rise = number/(int)rate;
        System.out.println(rise);
    }
}
