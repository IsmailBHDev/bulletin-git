
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BulletinTest {

@ParameterizedTest(name = "moyenne {0} : {1}")
@CsvSource({
    "59, Échec",
    "60, Réussite",
    "61, Réussite"
})
@DisplayName("La réussite commence à 60")
void mentionSelonLeSeuilDeReussite(int moyenne, String mentionAttendue) {
    assertEquals(mentionAttendue, Bulletin.calculerMention(moyenne));
}

    @Test
    void moyenneDiviseLeTotalEtAjouteLeBonus() {
        // Arrange : préparer les données
        int total = 240;

        // Act : appeler la méthode testée
        int moyenne = Bulletin.calculerMoyenne(total);

        // Assert : vérifier le résultat attendu
        assertEquals(85, moyenne);
    }

    @Test
    void moyenneDe85DonneLaMentionReussite() {
        assertEquals("Réussite", Bulletin.calculerMention(85));
    }

    @Test
    void moyenneDeTroisNotesDe60() {
        assertEquals(65, Bulletin.calculerMoyenne(180));
    }

}
