package enumsJava;

public class ClasseTesteEnum {

    EnumPlanetas planeta;

    ClasseTesteEnum(String planeta) {
        this.planeta = EnumPlanetas.valueOf(planeta);
    }

    public void viajarPlaneta() {
        switch (planeta) {
            case Mercúrio:
                System.out.println("Muito quente por lá.");
                break;
            case Vênus:
                System.out.println("Muito quente por lá.");
                break;
            case Terra:
                System.out.println("Muito ar para respirar.");
                break;
            case Marte:
                System.out.println("Tem vida.");
                break;
            case Júpeti:
                System.out.println("Tem ET de vaginha.");
                break;
            case Saturno:
                System.out.println("Muito gelado por lá.");
                break;
            case Urano:
                System.out.println("É ar muito seco.");
                break;
            case Neturno:
                System.out.println("Não tem vida.");
                break;
            default:
                System.out.print("Passagem esgotada.");
        }
    }
}