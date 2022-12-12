package it.develhope.booleanOperators1;

public class Main {
    public static void main(String[] args) {
        boolean a = 2 <= 2 && !true; //FALSE perché 2<=2 è true, mentre !true è false, quindi non sono entrambi true e
        // l'operatore AND riporterà false
        boolean b = !false && 3 > 2; //TRUE perché !false è true, così come 3>2, quindi l'operatore AND riporterà true
        boolean c = !(!true || false); //TRUE perché !true è false, quindi il risultato sarebbe true, ma cambiandolo con
        // l'operatore NOT sarà comunque true
        boolean d = 6 > 6 ^ !(true && true); //FALSE perché 6>6 è false, mentre utilizzando NOT su true&&true si otterrà
        // false, quindi avendo due risultati uguali per l'operatore XOR sarà false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
