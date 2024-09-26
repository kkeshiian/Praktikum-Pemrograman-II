import java.util.Scanner;

public class PRAK104_2310813710011_MuhammadRizky {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String inputAbu = input.nextLine();

        System.out.print("Tangan Bagas: ");
        String inputBagas = input.nextLine();

        int poinAbu = 0;
        int poinBagas = 0;
        int n = 0;

        while (n <= inputAbu.length()){
            if (inputAbu.charAt(n) == 'G' && inputBagas.charAt(n) == 'B' ||
                    inputAbu.charAt(n) == 'K' && inputBagas.charAt(n) == 'G' ||
                    inputAbu.charAt(n) == 'B' && inputBagas.charAt(n) == 'K') {
                poinBagas++;
            } else if (inputAbu.charAt(n) == 'B' && inputBagas.charAt(n) == 'G' ||
                    inputAbu.charAt(n) == 'G' && inputBagas.charAt(n) == 'K' ||
                    inputAbu.charAt(n) == 'K' && inputBagas.charAt(n) == 'B') {
                poinAbu++;
            }
            n += 2;
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else if (poinBagas == poinAbu) {
            System.out.println("Seri");
        }
    }
}
