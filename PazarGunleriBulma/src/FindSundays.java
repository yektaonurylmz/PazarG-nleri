

public class FindSundays implements IFindSundays {

    int[] DaysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] MonthName={"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

    @Override
    public boolean LastMonth(int a, int b) {
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
    public String Print(int month, String[] MountName, int year) {

        return "01." + (MountName[month+1]) +"."+ year ;
    }

    @Override
    public String PrintFirstMonthOfYear(int year) {
        return "01.Ocak."+(year+1);
    }

    @Override
    public void Hesapla(int day,int mouth, int startYear, int endYear) {

        for (int year = startYear; year <= endYear; year++) {

            if (LeapYear(year)){
                DaysOfMonths[1]=29;
            }else
                DaysOfMonths[1]=28;
            mouth=0;
            while (mouth < DaysOfMonths.length){

                day +=  DaysOfMonths[mouth];

                day = (day%7); // 12 bit'lik değeri aşmayacak şekilde düzenlendi;

                switch (LastMonth(day,mouth)? 1:0){
                    case 1 : System.out.println(PrintFirstMonthOfYear(year));
                    break;
                    case 0:
                        switch (Sunday(day) ? 1 : 0) {
                            case 1 -> System.out.println(Print(mouth, MonthName, year));
                        }
                }
                mouth++;
            }
        }
    }

    public static void main(String[] args) {
        FindSundays findSundays=new FindSundays();
            findSundays.Hesapla(1,0,1900,2000);
    }
}

