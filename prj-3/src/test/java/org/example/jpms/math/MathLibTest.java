package org.example.jpms.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathLibTest {
    @ParameterizedTest
    @CsvSource({
             "0, false",
             "1, false",
             "2, true",
             "3, true",
             "4, false",
             "5, true",
             "6, false",
             "7, true",
             "8, false",
             "9, false",
            "10, false",
            "11, true",
            "12, false",
            "13, true",
            "14, false",
            "15, false",
            "16, false",
            "17, true",
            "18, false",
            "19, true",
            "20, false",
    })
    public void testToString(int n, boolean prime) {
        Assertions.assertEquals(prime, MathLib.isPrime(n));
    }
}
