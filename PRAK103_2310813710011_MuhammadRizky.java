import java.util.Scanner;

public class PRAK103_2310813710011_MuhammadRizky {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputBaris = input.nextInt();
        int inputMulai = input.nextInt();
        int baris = 0;
        do {
            if (inputMulai % 2 == 1){
                System.out.print(inputMulai);
                baris++;
                if (baris < inputBaris){
                    System.out.print(", ");
                }
            }
            inputMulai++;
        } while (baris < inputBaris);
    }
}
