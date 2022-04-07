package Day3;

public class Inheritance extends Employee{
    int a =1900;
    public static void main(String args[]){
        Inheritance i = new Inheritance();
        System.out.println(i.getEmpID());
        System.out.println(i.a);
    }
}
