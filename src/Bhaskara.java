import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculaBhaskara cb = new CalculaBhaskara();
        
        System.out.println("Entre as raízes:");
        cb.setA(sc.nextDouble());
        cb.setB(sc.nextDouble());
        cb.setC(sc.nextDouble());

        System.out.println("A raíz X¹ é " + cb.bhaskaraX1());
        System.out.println("A raíz X² é " + cb.bhaskaraX2());


    }
}
