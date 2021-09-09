package xyz.dddd.algorithm.question;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.dddd.algorithm.question.programmers.ReverseTripleString;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTripleStringTests {

  private static ReverseTripleString reverseTripleString;

  @BeforeAll
  public static void setUp() {
    reverseTripleString = new ReverseTripleString();
  }

  @Test
  public void givenDecimalWhenSolveThen() {
    int decimal = 45;

    int actual = reverseTripleString.solution(decimal);

    int expected = 7;
    assertEquals(expected, actual);
  }

}
