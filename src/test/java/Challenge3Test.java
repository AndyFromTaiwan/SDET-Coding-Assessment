import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Challenge3Test {

    @Test
    void reverse() {
        Assertions.assertEquals("", Challenge3.reverse(""));
        Assertions.assertEquals(" ", Challenge3.reverse(" "));
        Assertions.assertEquals("a", Challenge3.reverse("a"));
        Assertions.assertEquals("ab", Challenge3.reverse("ba"));
        Assertions.assertEquals("cba", Challenge3.reverse("abc"));
        Assertions.assertEquals("redro esrever", Challenge3.reverse("reverse order"));
        Assertions.assertEquals("aba", Challenge3.reverse("aba"));
        Assertions.assertEquals("abba", Challenge3.reverse("abba"));
    }

    @Test
    void reverseAndReplaceSpace() {
        Assertions.assertEquals("", Challenge3.reverseAndReplaceSpace(""));
        Assertions.assertEquals("-", Challenge3.reverseAndReplaceSpace(" "));
        Assertions.assertEquals("-", Challenge3.reverseAndReplaceSpace("                "));
        Assertions.assertEquals("redro-esrever", Challenge3.reverseAndReplaceSpace("reverse-order"));
        Assertions.assertEquals("redro-esrever", Challenge3.reverseAndReplaceSpace("reverse order"));
        Assertions.assertEquals("redro-esrever-gnirts", Challenge3.reverseAndReplaceSpace("string   reverse    order"));
        Assertions.assertEquals("-redro-esrever-", Challenge3.reverseAndReplaceSpace("   reverse   order "));
    }
}