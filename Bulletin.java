
public class Bulletin {
    static final int NB_NOTES = 3;
    static final int BONUS = 5;
    public static void main(String[] args) {
        afficherBulletin("Étudiant démonstration", 70, 100, 70);
        System.out.println("----------");
        afficherBulletin("Étudiante assidue", 90, 80, 85);

    }
    
    private static void afficherBulletin(String etudiant, int note1, int note2, int note3) {
        int total = note1 + note2 + note3;
        int moyenne = calculerMoyenne(total);

        System.out.println("Étudiant : " + etudiant);
        System.out.println("Notes : " + note1 + ", " + note2 + ", " + note3);
        System.out.println("Total : " + total);
        System.out.println("Moyenne : " + moyenne);
    }
    private static int calculerMoyenne(int total) {
        return total / NB_NOTES + BONUS;
    }
}
