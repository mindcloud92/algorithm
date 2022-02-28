package xyz.superdev.algorithm.question;


/**
 * <h3><a href="https://leetcode.com/problems/two-sum/">"Two Sum"</a></h1>
 * <p>· 문제: 숫자 배열 nums와 특정 수 target이 주어질 때 nums[i] + nums[j] = target이 인덱스 i와 j를 순차로 담은 배열을 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>2 <= nums.length <= 10의 4승</li>
 *   <li>-10의 9승 <= nums[i] <= 10의 9승</li>
 *   <li>-10의 9승 <= target <= 10의 9승</li>
 * </ol>
 */
public class TwoSum {

  public int[] solve(final int[] nums, final int target) {
    for (int i = 0; i < nums.length; i++) {

      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }

    return new int[2];
  }

}
