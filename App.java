import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        final byte MAH_HA = 12;
        final byte DARSAD = 100;
        Scanner input = new Scanner(System.in);

        System.out.println("mablagh vam (to milion toman): ");
        int mablaghVam = input.nextInt();

        System.out.println("Sood Salaneh: ");
        double soodvam = input.nextDouble();
        double darsadSoodMahaneh = soodvam / MAH_HA / DARSAD;

        System.out.println("BazPardakht (to year): ");
        int bazPardakht = input.nextInt();
        int aghsat = bazPardakht * MAH_HA;

        double parantez = Math.pow( (1 + darsadSoodMahaneh), aghsat);

        double harGhest = mablaghVam * darsadSoodMahaneh * parantez / (parantez - 1);

        System.out.println("mablagh har ghest: " + harGhest + "milion toman");

        double sood = (aghsat * harGhest) - mablaghVam;
        System.out.println("sood vam: " + sood + "milion toman");
    }
}
