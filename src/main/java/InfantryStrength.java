public class InfantryStrength {
    public static void main(String[] args) {
       final int INFANTRY_LANNISTERS = 1207;
       final int ORKS_SARUMAN = 2000;
       final int TOTAL_INFANTRY = INFANTRY_LANNISTERS + ORKS_SARUMAN;

        System.out.println("Численность пехоты у Ланнистеров составляет - " + INFANTRY_LANNISTERS + " единиц.");
        System.out.println("Численность пехоты Сарумана равна " + ORKS_SARUMAN + " единицам.");
        System.out.println("Общая численность пехоты Ланнистеров и Сарумана равна " + TOTAL_INFANTRY + " единицам.");
    }
}