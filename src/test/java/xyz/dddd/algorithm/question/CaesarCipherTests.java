package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CaesarCipherTests {

  private static CaesarCipher caesarCipher;

  @BeforeAll
  public static void setUp() {
    caesarCipher = new CaesarCipher();
  }

  @Test
  public void given_String_when_ToCaesarCipher_then_CaesarCipher() {
    String s = "a B z";
    int n = 4;

    String actual = caesarCipher.solve(s, n);

    String expected = "e F d";
    assertEquals(expected, actual);
  }

}
