
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

@DisplayName("Export JSON d'un bulletin")
class BulletinJsonTest {

    private Gson gson;

    @BeforeEach
    void preparer() {
        gson = new Gson();
    }

    @Test
    @DisplayName("Le JSON contient le total, la moyenne et la mention")
    void jsonContientLesResultatsDeLEtudiant() {

        // Arrange
        String json = Bulletin.exporterJson(
            "Étudiante assidue", 90, 80, 85
        );

        // Act
        ResumeBulletin resume =
            gson.fromJson(json, ResumeBulletin.class);

        // Assert
        assertAll(
            () -> assertEquals("Étudiante assidue", resume.etudiant),
            () -> assertEquals(255, resume.total),
            () -> assertEquals(90, resume.moyenne),
            () -> assertEquals("Réussite", resume.mention)
        );
    }
}
