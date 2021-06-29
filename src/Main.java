import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvOran = 0.18;
        System.out.print("Ücret Tutarını Giriniz :");
        double tutar =input.nextDouble();

        double kdvTutar = tutar * kdvOran;

        double kdvliTutar = tutar + kdvTutar;

        if (tutar>0 && tutar<1001){
            kdvOran = 0.18;
        }
        else if (tutar>1000){
            kdvOran = 0.8;
        }

        System.out.println("KDVSİZ TUTAR : "+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutar);
        System.out.println("KDV Tutarı : "+kdvliTutar);
        System.out.println(kdvliTutar);








    }
}
