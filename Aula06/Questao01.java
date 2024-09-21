package Aula06;

public class Questao01 {
    public static void main(String[] args) {
        int c = 4, d = 50, e =2, f = 81;
        for(int i = 1; i<=3; i++){
            c += 7;
            d -= 4;
            e *= 5;
            f /= 3;

            System.out.println(c + " " + d + " " + e + " " + f);
        }
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
