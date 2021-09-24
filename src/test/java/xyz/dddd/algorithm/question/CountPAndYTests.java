package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CountPAndYTests {

  private static CountPAndY countPAndY;

  @BeforeAll
  public static void setUp() {
    countPAndY = new CountPAndY();
  }

  @Test
  public void given_EqualsCountPAndY_when_EqualsCount_then_True () {
    String s = "pPoooyY";

    boolean actual = countPAndY.solve(s);
    assertTrue(actual);
  }

  @Test
  public void given_EqualsCountPAndY_when_EqualsCount_then_False () {
    String s = "Pyy";

    boolean actual = countPAndY.solve(s);
    assertFalse(actual);
  }
}
