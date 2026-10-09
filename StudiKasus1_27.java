import java.util.Scanner;

public class StudiKasus1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
    
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        else {
            diskon = 0;
        }

        System.out.println("total harga : " + totalHarga);
        System.out.println("diskon : " + diskon);
        System.out.println("total bayar : " + (totalHarga - diskon));

        if (uangBayar >= (totalHarga - diskon)) {
            kembalian = uangBayar - (totalHarga - diskon);
            System.out.println("kembalian : " + kembalian);
        }
        else {
            kurang = (totalHarga - diskon) - uangBayar;
            System.out.println("uang anda kurang : " + kurang);
        }
    }
}