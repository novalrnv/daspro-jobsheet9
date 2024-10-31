import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhnilai;
        double rata, total=0;
        int tertinggi = 0, terendah = 100;
        
        System.out.print("Masukkan jumlah nilai yang mau diinputkan : ");
        jmlhnilai=sc.nextInt();

        int[] nilaimhs = new int[jmlhnilai];
        for (int i = 0; i < jmlhnilai; i++){
            System.out.print("Masukkan nilai Mahasiswa, ke-"+(i+1)+" : ");
            nilaimhs[i]=sc.nextInt();
            if(nilaimhs[i] > tertinggi){
                tertinggi = nilaimhs[i];
            }
            if(nilaimhs[i] < terendah){
                terendah = nilaimhs[i];
            }
        }

        for (int j = 0; j < nilaimhs.length; j++){
            total += nilaimhs[j];
        }
        
        rata = total/nilaimhs.length;
        
        System.out.println("Rata-rata nilai Mahasiswa : "+rata);
        System.out.println("Nilai Mahasiswa tertinggi : "+tertinggi);
        System.out.println("Nilai Mahasiswa terendah : "+terendah);
        
        for (int i = 0; i < nilaimhs.length; i++){
            System.out.println("Nilai Mahasiswa, ke-"+(i+1)+" adalah "+nilaimhs[i]);
        }
    }
}