package Day1;

public class Str {
    public static void main(String args[]) {
        String name = "Tester";
        String n = new String("Tester");

        if (n == name) {
            System.out.println("T");
        } else {
            if(n.equals(name)){
                System.out.println("TT");
            }else{
            System.out.println("F");
            }
        }

        String value = "Typed Value";


    }
}
