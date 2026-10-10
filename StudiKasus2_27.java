import java.util.Scanner;

public class StudiKasus2_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = scanner.nextLine().trim();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = scanner.nextInt();

        int peringkat = 0;
        int statusPkm = 0;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            peringkat = scanner.nextInt();
            
            if (peringkat >= 1 && peringkat <= 3) {
                
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
                
            } else {
                System.out.println("Status : Juara Harapan atau peserta tidak memperoleh dana penghargaan.");
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPkm = scanner.nextInt();
            
            if (statusPkm == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
                
            } else {
                System.out.println("Status : Program Kreativitas Mahasiswa (PKM) belum lolos pendanaan.");
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan di luar ketentuan tidak memperoleh dana penghargaan.");
            
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        scanner.close();
    }
}