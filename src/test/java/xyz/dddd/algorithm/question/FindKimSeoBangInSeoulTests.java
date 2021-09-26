package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FindKimSeoBangInSeoulTests {

  private static FindKimSeoBangInSeoul findKimSeoBangInSeoul;

  @BeforeAll
  public static void setUp() {
    findKimSeoBangInSeoul = new FindKimSeoBangInSeoul();
  }

  @Test
  public void given_SeoulPeopelArray_when_FindKimSeoBangIndex_then_FormattedKimSeoBangIndexString() {
    String[] seoul = {"Jane", "Kim"};

    String actual = findKimSeoBangInSeoul.solve(seoul);

    String expected = "김서방은 1에 있다";
    assertEquals(expected, actual);
  }

}
