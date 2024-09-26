import java.util.Scanner;

public class PRAK102_2310813710011_MuhammadRizky {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputan = input.nextInt();

        int baris = 0;

        int inputanHasil;

        while (baris <= 10){
            if (inputan % 5 == 0){
                inputanHasil = inputan/5 - 1;
                System.out.print(inputanHasil);
            } else {
                System.out.print(inputan);
            }

            if (baris < 10){
                System.out.print(", ");
            }
            inputan++;
            baris++;

        }
    }
}
