import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Challenge1Test {

    @Test
    void encodeNumber() {
        // input in [1, 100]
        Assertions.assertEquals("1", Challenge1.encodeNumber(1));
        Assertions.assertEquals("2", Challenge1.encodeNumber(2));
        Assertions.assertEquals("Planit", Challenge1.encodeNumber(3));
        Assertions.assertEquals("Planit", Challenge1.encodeNumber(6));
        Assertions.assertEquals("Testing", Challenge1.encodeNumber(5));
        Assertions.assertEquals("Testing", Challenge1.encodeNumber(10));
        Assertions.assertEquals("PlanitTesting", Challenge1.encodeNumber(15));
        Assertions.assertEquals("PlanitTesting", Challenge1.encodeNumber(90));
        Assertions.assertEquals("Testing", Challenge1.encodeNumber(100));
        // extends to all integer input
        Assertions.assertEquals("PlanitTesting", Challenge1.encodeNumber(0));
        Assertions.assertEquals("2147483647", Challenge1.encodeNumber(Integer.MAX_VALUE));
        Assertions.assertEquals("-2147483648", Challenge1.encodeNumber(Integer.MIN_VALUE));
    }
}