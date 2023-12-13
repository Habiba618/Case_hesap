import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("eded 1: ");
        a = sc.nextDouble();
        System.out.print("eded 2: ");
        b = sc.nextDouble();
        System.out.println("1 -> +");
        System.out.println("2 -> -");
        System.out.println("3 -> *");
        System.out.println("4 -> /");
        int value = sc.nextInt();
        switch (value) {
            case 1:
                System.out.println(a+"+"+b +"="+ (a+b));
                break;
            case 2:
                System.out.println(a+"-"+b +"="+ (a-b));
                break;
            case 3:
                System.out.println(a+"/"+b +"="+ (a/b));
                break;
          case 4:
               if(b!=0) {
                   System.out.println(a + "*" + b + "=" + (a * b));
               }else{
                   System.out.println("0-a bolme yoxdur");
               }
              break;
            default:
                System.out.println("Secim dogru deyil");

    }
}
}
