import java.util.Scanner;

public class SearchNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int hasil = 0;
        int jmlhnilai;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        jmlhnilai = sc.nextInt();
        sc.nextLine();
        
        int[] arrnilai = new int[jmlhnilai];
        for (int j = 0; j < arrnilai.length; j++){
            System.out.print("Masukkan nilai Mahasiswa ke-" + (j + 1) + " : ");
            arrnilai[j]= sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrnilai.length; i++){
            if (arrnilai[i] == key){
                hasil = i;
                break;
            }
        }

        if (hasil != 0){
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai Mahasiswa ke-"+(hasil+1));
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan!");
        }
    }
}