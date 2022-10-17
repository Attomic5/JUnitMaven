import TaxType.IncomeTaxType;
import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class IncomeTaxTypeTests {

    IncomeTaxType tax;

    @BeforeAll
    public static void startAllTests() {
        System.out.println("Тесты стартовали");
    }

    @BeforeEach
    public void initEachTest() {
        tax = new IncomeTaxType();
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
    public void TestMethodIncomeTax() {
        //assert
        double amount = 153627, expected = 19971.51;

        //act
        double result = tax.calculateTaxFor(amount);

        //assert
        assertEquals(expected, result);

    }


}
