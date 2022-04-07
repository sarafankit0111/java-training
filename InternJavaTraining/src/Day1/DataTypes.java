package Day1;

public class DataTypes {
    public static void main(String[] args) {
//        Primitive DataTypes
        boolean flag = true;
        byte code = 100;
        short point = 999;
        int id = 20167;
        long range = 122333L;
        float price = 22.35F;
        double quantity = 40.345;
        char status = 'Y';

//        Size, Max, Min, Value
        System.out.println("Value:" + flag);
        System.out.println(Byte.SIZE + "\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE + "\t" +  "Value:" + code);
        System.out.println(Short.SIZE + "\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE + "\t" + "Value:" + point);
        System.out.println(Integer.SIZE + "\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE + "\t" + "Value:" + id);
        System.out.println(Long.SIZE + "\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE + "\t" + "Value:" + range);
        System.out.println(Float.SIZE + "\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE + "\t" + "Value:" + price);
        System.out.println(Double.SIZE + "\t" + Double.MAX_VALUE + "\t" + Double.MAX_VALUE + "\t" + "Value:" + quantity);
        System.out.println(Character.SIZE + "\t" + Character.MIN_VALUE + "\t" + Character.MAX_VALUE + "\t" + "Value:" + status);
    }
}
