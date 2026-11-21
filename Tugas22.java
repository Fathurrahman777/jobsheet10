import java.util.Scanner;
public class Tugas22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[][] survei = new int[10][6];

        System.out.println("Survei kepuasan pelanggan terhadap layanan yang diberikan");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("input nilai responden ke-" + (i + 1));
            double totResponden = 0;

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Nilai Pertanyaan ke-" + (j + 1) + " (1-5) : ");
                survei[i][j] = sc.nextInt();
                if (survei[i][j] < 1 || survei[i][j] > 5){
                    System.out.println("Nilai tidak valid. Input ulang");
                    j--;
                    continue;
                } else {
                totResponden += survei[i][j];
                }
            }

            System.out.println("Nilai rata-rata responden: " + totResponden / 6);
        }
        System.out.println("Rata-rata setiap peranyaan");

        for (int j = 0; j < 6; j++) {
            double totPertanyaan = 0;
            
            for (int i = 0; i < 10; i++) {
                totPertanyaan = survei[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + totPertanyaan / 10);
        }
        sc.close();
    }
    
}
