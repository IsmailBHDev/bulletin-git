
public class Bulletin {
    static final int NB_NOTES = 3;
    static final int BONUS = 5;
    public static void main(String[] args) {
        String etudiant = "Étudiant démonstration";
        int note1 = 70;
        int note2 = 100;
        int note3 = 70;

        int total = note1 + note2 + note3;
        int moyenne = total / NB_NOTES + BONUS;

        System.out.println("Étudiant : " + etudiant);
        System.out.println("Notes : " + note1 + ", " + note2 + ", " + note3);
        System.out.println("Total : " + total);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("----------");
        String e2 = "Étudiante assidue";
        int n4 = 90;
        int n5 = 80;
        int n6 = 85;
        int t = n4 + n5 + n6;
        int m = t / NB_NOTES + BONUS;
        System.out.println("Étudiant : " + e2);
        System.out.println("Notes : " + n4 + ", " + n5 + ", " + n6);
        System.out.println("Total : " + t);
        System.out.println("Moyenne : " + m);

    }
}
