package Day5;

public class Test extends Throwable{
    void route()throws ArithmeticException{
        throw new ArithmeticException("route");

    }

    void check()throws ClassNotFoundException{
        Class.forName("Class");
        throw new ClassNotFoundException();
    }
    public static void main(String args[]) throws Exception {

        Test t = new Test();
//
//        throw new Wrong();

        //t.route();
        /*try{
            t.check();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }*/

       /* int a = 100;
        int b = 282828;

        if(a < b){
            throw new Exception("Smaller");
        }else{
            throw new NullPointerException("Bigger");
        }*/




     /*   int arr[] = new int[2];
        try{
            for(int i=0; i < 4; i++){
                arr[i]=1;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("The End");
        }*/





       /* int c, a = 10, b = 0;
        String name=null;
*/
       /* try{
            //System.out.println(name.length());
            c=a/b;  //        Eneter n = new Eneter();

        }catch(ArithmeticException e) {
            System.out.println(e);
            //e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }
}
