package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BasicOfHandleStringTests {

  private static BasicOfHandleString basicOfHandleString;

  @BeforeAll
  public static void setUp() {
    basicOfHandleString = new BasicOfHandleString();
  }

  @Test
  public void given_ContainAlphabetString_when_ValidateOnlyNumber_then_False() {
    String s = "a234";

    boolean actual = basicOfHandleString.solve(s);

    assertFalse(actual);
  }

  @Test
  public void given_OnlyNumberString_when_ValidateOnlyNumber_then_True() {
    String s = "1234";

    boolean actual = basicOfHandleString.solve(s);

    assertTrue(actual);
  }

}
