package xyz.dddd.algorithm.lesson.basis;

public class DayOfYear {

  private static final int[][] daysPerMonth = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };

  public int get(final int year, final int month, final int day) {
    int days = day;

    int yearIndex = getYearIndex(year);
    for (int i = 1; i < month; i++) {
      days += daysPerMonth[yearIndex][i - 1];
    }

    return days;
  }

  public int remain(final int year, final int month, final int day) {
    return 365 + getYearIndex(year) - get(year, month, day);
  }

  public boolean isLeap(final int year) {
    return year % 400 == 0 || year % 100 == 0 || year % 4 == 0;
  }

  private int getYearIndex(final int year) {
    return isLeap(year) ? 1 : 0;
  }
}
