package Day3;

public class College implements Ugc{
    @Override
    public void rule() {
        System.out.println("Rules are Implemented");
    }

    @Override
    public void control() {
        System.out.println("Control Over UGC");
    }
    public static void main(String args[]){
        College c = new College();
        c.rule();
        c.control();
    }
}
