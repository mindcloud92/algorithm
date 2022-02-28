package xyz.superdev.algorithm.question;

/**
 * <h3><a href="https://programmers.co.kr/learn/courses/30/lessons/12919">"서울에서 김서방 찾기"</a></h1>
 * <p>· 문제: String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>"Kim"은 반드시 seoul 안에 포함</li>
 *   <li>seoul의 길이: 1 이상, 1000 이하</li>
 *   <li>seoul의 원소: 길이 1 이상, 20 이하인 문자열</li>
 * </ol>
 */
public class FindKimSeoBangInSeoul {

  private static final String KEY = "Kim";

  private static final String RETURN_FORMAT = "김서방은 %d에 있다";

  @SuppressWarnings("StatementWithEmptyBody")
  public String solve(final String[] seoul) {
    int index;
    for (index = 0; !seoul[index].equals(KEY); index++) {
      ;
    }

    return String.format(RETURN_FORMAT, index);

  }
}
