import java.util.Scanner;

public class PRAK101_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = input.nextFloat();

        String bulanLahirString = "";
        switch (bulanLahir) {
            case 1:
                bulanLahirString = "Januari";
                break;
            case 2:
                bulanLahirString = "Februari";
                break;
            case 3:
                bulanLahirString = "Maret";
                break;
            case 4:
                bulanLahirString = "April";
                break;
            case 5:
                bulanLahirString = "Mei";
                break;
            case 6:
                bulanLahirString = "Juni";
                break;
            case 7:
                bulanLahirString = "Juli";
                break;
            case 8:
                bulanLahirString = "Agustus";
                break;
            case 9:
                bulanLahirString = "September";
                break;
            case 10:
                bulanLahirString = "Oktober";
                break;
            case 11:
                bulanLahirString = "November";
                break;
            case 12:
                bulanLahirString = "Desember";
                break;
            default:
                bulanLahirString = "Bulan tidak valid";
                break;
        }

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " "+ bulanLahirString + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }
}