package Day3;

public class Overloading {
    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, float b){
        System.out.println(a + b);
    }

    public static void main(String args[]){
        int a = 6;
        int b = 10;
        float c = 12.6f;
        Overloading o = new Overloading();
        o.add(a, b);
        o.add(a, c);
    }
}
