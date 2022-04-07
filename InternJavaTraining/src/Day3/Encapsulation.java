package Day3;

public class Encapsulation {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.setEmpID(11);
        e1.setEmpName("Rohit");
        e1.setEmpSalary(200000);

        System.out.println(e1.getEmpID() + e1.getEmpName() + e1.getEmpSalary());
    }
}
