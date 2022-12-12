package it.develhope.booleanOperators1;

public class Main {
    public static void main(String[] args) {
        boolean a = 2 <= 2 && !true; //false
        boolean b = !false && 3 > 2; //true
        boolean c = !(!true || false); //true
        boolean d = 6 > 6 ^ !(true && true); //false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
