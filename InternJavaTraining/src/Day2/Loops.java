package Day2;

public class Loops {
    public static void main(String args[]){
        int a = 1928;
        int b = 90067;
        int c = 8987;
        boolean flag = true;

//        if, else, elseif
        if(a > b && a > c){
            System.out.println(a + " is greater");
        }else if(b > a && b > c){
            System.out.println(b + " is greater");
        }else{
            System.out.println(c + " is greater");
        }
//        for
        for(int i=1; i<=30; i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
//        nested loop
        if(a%2==0){
            if(a%4==0){
                System.out.println("Nested Loop");
            }
        }

        switch(a){
            case 2020: System.out.println("2020");
                        break;
            case 2010: System.out.println("2010");
                        break;
            case 1920: System.out.println("1920");
                        break;
            case 1928: System.out.println("1928");
                        break;
            default: System.out.println("Not Found");
        }

        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        while(flag){
            if(++c == 9000){
                flag = false;
            }
            System.out.println(c);
        }
        flag = true;
        do{
            if(--b == 90000){
                flag = false;
            }
            System.out.println(b);
        }while(flag);
    }
}
