import java.util.Scanner;

public class ArrayRataNilai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        double rata;
        
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlhmhs=input.nextInt();
        input.nextLine();
        
        int[] nilaimhs = new int[jmlhmhs];
        for (int i = 0; i < nilaimhs.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaimhs[i]=input.nextInt();
        }

        double reratalulus;
        double reratatidaklulus;
        int lulus = 0, tidaklulus = 0;
        int nilailulus = 0, nilaitidaklulus = 0;
        for (int i = 0; i < nilaimhs.length; i++){
            total += nilaimhs[i];
            if (nilaimhs[i] > 70){
                lulus++;
                nilailulus += nilaimhs[i];
            } else {
                tidaklulus++;
                nilaitidaklulus += nilaimhs[i];
            }
        }
        
        reratatidaklulus = nilaitidaklulus/tidaklulus;
        reratalulus = nilailulus/lulus;
        // rata = total/nilaimhs.length;
        System.out.println("Rata-rata nilai lulus = "+reratalulus);
        System.out.println("Rata-rata nilai tidak lulus = "+reratatidaklulus);
    }
}