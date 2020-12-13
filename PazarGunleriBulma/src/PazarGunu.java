public class PazarGunu {
    public static void main(String[] args) {

        int Son_yıl = 2000;

        int[] Ay_gun = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Ay_isim = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

        int Haftanin_Gunu = 1; // 1.1.1900 Pazartesi
        int Ayın_gunleri ;


        for (int year = 1900; year <= Son_yıl; year++) { // Hangi yıldayız
            if (year % 4 == 0 && year % 100 != 0) {
                Ay_gun[1] = 29;
            } else {
                Ay_gun[1] = 28;
            }
            int month=0;

            for (month = 0; month < Ay_gun.length; month++) { // Hangi aydayız

                for (Ayın_gunleri = 1; Ayın_gunleri <= Ay_gun[month]; Ayın_gunleri++) { // Ayda kaç gün var

                    if (Ayın_gunleri == 1 && Haftanin_Gunu == 7) { // Ayın ilk günü Hafatanın son günü mü ?
                        System.out.println(Ayın_gunleri + " " + Ay_isim[month] + " " + year);
                    }
                    Haftanin_Gunu++;

                    if (Haftanin_Gunu == 8) {
                        Haftanin_Gunu = 1;
                    }
                }
            }
        }
    }
}
