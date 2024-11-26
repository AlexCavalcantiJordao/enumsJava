package enumsJava;

import java.util.Locale;
import java.util.Scanner;

public class EnumsMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String planeta;
        System.out.print("Para qual planeta quer viajar ?: ");
        planeta = entrada.next().toUpperCase();
        entrada.close();

        ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
        pl.viajarPlaneta();
    }
}