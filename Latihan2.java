import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalbiaya = 0;

        System.out.print("Masukkan jumlah pesanan : ");
        int jmlh=sc.nextInt();
        sc.nextLine();

        String[] nama = new String[jmlh];
        int[] harga = new int[jmlh];

        for(int i = 0; i < nama.length; i++){
            System.out.print("Masukkan nama makanan/minuman : ");
            nama[i]=sc.nextLine();
            System.out.print("Masukkan Harga pesanan : ");
            harga[i]=sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < harga.length; i++){
            totalbiaya += harga[i];
        }

        System.out.println();
        System.out.println("===================");
        System.out.println("Jumlah pesanan : "+jmlh);
        for(int j = 0; j < nama.length; j++){
            System.out.println("Nama pesanan : "+nama[j]);
            System.out.println("Harga pesanan : "+harga[j]);
        }
        System.out.println("Total Biaya pesanan = Rp."+totalbiaya);
    }
}