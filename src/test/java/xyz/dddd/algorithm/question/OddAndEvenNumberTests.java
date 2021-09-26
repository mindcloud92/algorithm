package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OddAndEvenNumberTests {

  private static OddAndEvenNumber oddAndEvenNumber;

  @BeforeAll
  public static void setUp() {
    oddAndEvenNumber = new OddAndEvenNumber();
  }

  @Test
  public void given_OddNumber_when_MapToString_then_OddString() {
    int number = 3;

    String actual = oddAndEvenNumber.solve(number);

    String expected = "Odd";
    assertEquals(expected, actual);
  }

  @Test
  public void given_EvenNumber_when_MapToString_then_EvenString() {
    int number = 4;

    String actual = oddAndEvenNumber.solve(number);

    String expected = "Even";
    assertEquals(expected, actual);
  }

}