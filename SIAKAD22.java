import java.util.Scanner;
public class SIAKAD22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Massukan jumlah mahsiswa: ");
        int jumlahMhs = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMhs][jumlahMatkul];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("input nilai mahsiswa ke-" + (i + 1));
            double tottalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                tottalPersiswa += nilai[i][j];
            }

            double rata2Mhs = tottalPersiswa / jumlahMatkul;

            System.out.println("Nialai rata rata: " + rata2Mhs);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah:");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPermatkul = 0;
            for (int i = 0; i < jumlahMhs; i++) {
                totalPermatkul += nilai[i][j];
            }

            double rata2Matkul = totalPermatkul / jumlahMhs;
            System.out.println("Mata kuliah " + (j + 1) + ": " + rata2Matkul);
            
        }
        sc.close();
    }
    
}
