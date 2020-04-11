import java.util.Scanner;

public class InputOutput {
 public static void main (String [] args) {
  Scanner scanner = new Scanner (System.in);
  String nama,npm,kelas;
  int jumlahSKS;
  double IPK;

  System.out.println("### Penghitung Nilai Mahasiswa ###");
  System.out.print("Masukkan Nama Anda   : ");
  nama = scanner.nextLine();
  System.out.print("Masukkan NPM Anda    : ");
  npm = scanner.nextLine();
  System.out.print("Masukkan Kelas Anda  : ");
  kelas = scanner.nextLine();
  System.out.println("Nama   : "+nama);
  System.out.println("NPM    : "+npm);
  System.out.println("Kelas  : "+kelas);

  System.out.print("Masukkan jumlah SKS yang sudah ditempuh : ");
  jumlahSKS = scanner.nextInt();

  System.out.print("Masukkan IPK Sementara : ");
  IPK = scanner.nextDouble();

  double jumlah = IPK * jumlahSKS;
  System.out.print("Total Nilai = "+jumlah);
 }
}
