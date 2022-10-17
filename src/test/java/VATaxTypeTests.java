import TaxType.VATaxType;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VATaxTypeTests {

    VATaxType tax;

    @BeforeAll
    public static void startAllTests() {
        System.out.println("Тесты стартовали");
    }

    @BeforeEach
    public void initEachTest() {
        tax = new VATaxType();
        System.out.println("Калькулятор налога на доход создан");
    }

    @AfterEach
    public void afterEachTest() {
        tax = null;
        System.out.println("Калькулятор обнулен");
    }

    @AfterAll
    public static void finishAllTests() {
        System.out.println("Тесты завершены");
    }

    @Test
    public void TestMethodVATax() {
        //assert
        double amount = 756457, expected = 136162.26;

        //act
        double result = tax.calculateTaxFor(amount);

        //assert
        assertEquals(expected, result);

    }

}
