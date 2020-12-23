public interface IFindSundays {
    boolean LastMonthOfYear(int day, int month);
    boolean LeapYear(int year);
    String PrintConsole(int month, String[] monthName, int year);
    String PrintFirstMonthOfYear(int year);
    void Calculate(int day , int month, int startYear, int endYear);
    boolean Sunday(int day);

}
