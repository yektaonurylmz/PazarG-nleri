import java.time.LocalDate;
import java.time.Period;

public class FindSundays implements IFindSundays {

    int[] DaysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] MonthName={"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

    @Override
    public boolean LastMonthOfYear(int a, int b) {
      return a%7==0 && b==11;
    }
    @Override
    public boolean Sunday(int day) {
        return day%7==0;
    }

    @Override
    public boolean LeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 4000 != 0;
    }

    @Override
    public String PrintConsole(int month, String[] MonthName, int year) {

        return "01." + (MonthName[month+1]) +"."+ year ;
    }

    @Override
    public String PrintFirstMonthOfYear(int year) {
        return "01.Ocak."+(year+1);
    }

    @Override
    public void Calculate(int day, int month, int startYear, int endYear) {

        for (int year = startYear; year <= endYear; year++) {

            if (LeapYear(year)){
                DaysOfMonths[1]=29;
            }else
                DaysOfMonths[1]=28;
            month=0;
            while (month < DaysOfMonths.length){

                day +=  DaysOfMonths[month];

                day = (day%7);

                switch (LastMonthOfYear(day,month)? 1:0){
                    case 1 : System.out.println(PrintFirstMonthOfYear(year));
                    break;
                    case 0:
                        switch (Sunday(day) ? 1 : 0) {
                            case 1 -> System.out.println(PrintConsole(month, MonthName, year));
                        }
                }
                month++;
            }
        }
    }

    public static void main(String[] args) {
         FindSundays findSundays=new FindSundays();
         findSundays.Calculate(1,0,1900,2000);

        //LocalDate startDate = LocalDate.of(1900,1,1);
        //LocalDate endDate = LocalDate.of(2000,12,31);
        //
        //startDate.datesUntil(endDate, Period.ofDays(1)).forEach(date -> {
        //
        //    if(date.getDayOfMonth() ==  1 && date.getDayOfWeek().toString().equals("SUNDAY")){
        //        System.out.println(date.toString());
        //    }
        //
        //});
    }
}

