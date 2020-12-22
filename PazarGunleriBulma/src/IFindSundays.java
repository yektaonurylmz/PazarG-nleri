public interface IFindSundays {
    boolean LastMonth(int day,int month);
    boolean LeapYear(int year);
    String Print(int month, String[] monthName, int year);
    String PrintFirstMonthOfYear(int year);
    void Hesapla(int day,int month,int startYear,int endYear);
    boolean Sunday(int day);

}
