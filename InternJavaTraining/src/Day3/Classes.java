package Day3;

import java.awt.*;

public class Classes {
    public static void main(String args[]){
        Classes c = new Classes();
        Classes.InnerClass I = c.new InnerClass();
        I.show();
    }
    public class InnerClass{
        int a = 20;
        int b = 30;

        void show(){
            System.out.println("Sum:"+a + b);
        }
    }
}
