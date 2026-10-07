package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.print(Somar(a, b));

        sc.close();
    }
    public static int Somar(int a, int b) {
        return a + b;
    }
}
