import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReOrdenarTest {

    @Test
    @org.junit.Test

    public void test_01() {
        assertEquals(86522, ReOrdenar.ordenarDesc(62285)); // test con valores repetidos
    }

    @Test
    void test_02() {
        assertEquals(875421, ReOrdenar.ordenarDesc(124578)); // Test básico
    }

    @Test
    void test_03() {
        assertEquals(987654321, ReOrdenar.ordenarDesc(123456789)); //Test largo
    }

    @Test
    void test_04() {
        assertEquals(0, ReOrdenar.ordenarDesc(0)); // Test de numero 0
    }

    @Test
    void test_05() {
        assertEquals(5555, ReOrdenar.ordenarDesc(5555)); //Test de un único valor
    }