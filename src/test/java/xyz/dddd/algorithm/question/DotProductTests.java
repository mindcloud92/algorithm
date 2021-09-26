package xyz.dddd.algorithm.question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DotProductTests {

  private static DotProduct dotProduct;

  @BeforeAll
  public static void setUp() {
    dotProduct = new DotProduct();
  }

  @Test
  public void given_TwoIntegerArray_when_CalculateDotProduct_then_DotProduct() {
    int[] a = {1, 2, 3, 4};
    int[] b = {-3, -1, 0, 2};

    int actual = dotProduct.solve(a, b);

    int expected = 3;
    assertEquals(expected, actual);
  }

}