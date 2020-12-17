import java.time.LocalDate;
import java.time.Period;

public class PazarGunu {
    public static void main(String[] args) {

        int day = 1;
        int startYear = 1900, endYear = 2000;
        int[] MouthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] MountName={"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        for (int year = startYear; year <= endYear; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 4000 != 0) {
                MouthDays[1]=29;
            }else
                MouthDays[1]=28;
            int ay = 0;

            while (ay <=MouthDays.length-1) {

                day +=  MouthDays[ay];

                if(day%7 == 0 && ay==11){
                    System.out.println("01.Ocak." + (year+1) );
                }
                else if (day%7 == 0){
                    System.out.println("01." + (MountName[ay+1]) + "." + year );
                }
                ay++;
            }
        }
    }
    }

