import java.util.Scanner;
public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahsiswa ke-" + (i + 1));
            double tottalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                tottalPersiswa += nilai[i][j];
            }


            System.out.println("Nilai rata rata: " + tottalPersiswa/3);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah:");

        for (int j = 0; j < 3; j++) {
            double totalPermatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalPermatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPermatkul / 4);
            
        }
        sc.close();
    }
    
}
