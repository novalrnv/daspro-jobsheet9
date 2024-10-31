import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key;
        
        System.out.print("Sebutkan menu yang mau dipesan : ");
        key=sc.nextLine();


        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(key)){
                System.out.println("Menu Tersedia!");
                break;
            }else{
                System.out.println("Menu Tidak Tersedia!");
                break;
            }
        }
    }
}