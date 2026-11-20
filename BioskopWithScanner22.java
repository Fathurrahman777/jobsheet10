import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("Pilihan Menu");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();

                    if  (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] !=null) {
                        System.out.println("Kursi sudah terisi!");
                        continue;
                    }
                    penonton[baris - 1][kolom - 1]= nama;
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2: 
                    System.out.println("Daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3: 
                    System.out.println("Selesai");
                    break;
            
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (menu != 3);

        

        sc.close();
    }    
}
