import TaxType.ProgressiveTaxType;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTests {
    ProgressiveTaxType tax;

    @BeforeAll
    public static void startAllTests() {
        System.out.println("Тесты стартовали");
    }

    @BeforeEach
    public void initEachTest() {
        tax = new ProgressiveTaxType();
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

    @MethodSource("source")
    @ParameterizedTest
    public void TestProgressiveTax(double amount, double expected) {
        //act
        double result = tax.calculateTaxFor(amount);

        //assert
        assertEquals(expected, result);
    }

    public static Stream<Arguments> source() {
        return Stream.of(Arguments.of(99747, 9974.7), Arguments.of(756457, 113468.55));
    }


    @Test
    public void TestProgressiveTax() {
        //assert
        double amount = 99747, expected = 9974.7;

        //act
        double result = tax.calculateTaxFor(amount);

        //assert
        assertEquals(expected, result);
    }

}
