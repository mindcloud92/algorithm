package xyz.superdev.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CamelCaseTests {

  private static CamelCase camelCase;

  @BeforeAll
  public static void setUp() {
    camelCase = new CamelCase();
  }

  @Test
  public void given_String_when_CountWordByCamelCase_then_WordCount() {
    String s = "saveChangesInTheEditor";

    int actual = camelCase.solve(s);

    int expected = 5;
    assertEquals(expected, actual);
  }

}
