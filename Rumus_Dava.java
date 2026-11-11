import java.util.Scanner;
public class Rumus_Dava {
    static Scanner input = new Scanner(System.in);
    //+++++++++++++++++++++++++++ LUAS +++++++++++++++++++++++++++++
    // 1. Luas segitiga
    static void LuasSegitiga() {
        double alas = baca("Alas");
        double tinggi = baca("Tinggi");
        double luas = 0.5*alas*tinggi;
        System.out.println("Luas segitiga="+luas);
    }
    // 2. Luas persegi
    static void LuasPersegi() {
        double sisi = baca("Sisi");
        double luas = sisi*sisi;
        System.out.println("Luas persegi="+luas);
    }
    // 3. Luas Lingkaran
    static void LuasLingkaran() {
        double r = baca("JariJari");
        double luas = Math.PI*r*r;
        System.out.println("Luas Lingkaran="+luas);
    }
    // 4. Luas Trapesium
    static void LuasTrapesium() {
        double a = baca("Sisi Sejajar Pertama");
        double b = baca("Sisi Sejajar Kedua");
        double tinggi = baca("Tinggi");
        double luas = 0.5*(a+b)*tinggi;
        System.out.println("Luas Trapesium="+luas);
    }
    // 5. Luas Selimut Tabung
    static void LuasSelimutTabung() {
        double r = baca("JariJari");
        double tinggi = baca("Tinggi");
        double luas = 2*Math.PI*r*tinggi;
        System.out.println("Luas Selimut Tabung="+luas);
    }
    // 6. Luas Jajar Genjang
    static void LuasJajarGenjang() {
        double alas = baca("Alas");
        double tinggi = baca("Tinggi");
        double luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang="+luas);
    }
    // 7. Volume Balok
    static void VolumeBalok() {
        double lebar = baca("Lebar");
        double panjang = baca("Panjang");
        double tinggi = baca("Tinggi");
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok="+volume);
    }
    // 8. Volume Tabung
    static void VolumeTabung() {
        double r = baca("JariJari");
        double tinggi = baca("Tinggi");
        double volume = Math.PI*r*r*tinggi;
        System.out.println("Volume Tabung="+volume);
    }
    // 9. Volume Kubus
    static void VolumeKubus() {
        double sisi = baca("Sisi");
        double volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus="+volume);
    }
    // 10. Keliling Lingkaran
    static void KelilingLingkaran() {
        double r = baca("JariJari");
        double keliling = 2*Math.PI*r;
        System.out.println("Keliling Lingkaran="+keliling);
    }
    // 11. Keliling Persegi
    static void KelilingPersegi() {
        double sisi = baca("Sisi");
        double keliling = 4*sisi;
        System.out.println("Keliling Persegi="+keliling);
    }
    // 12. Keliling Bangun Datar
    static void KelilingBangunDatar() {
        double sisi = baca("Sisi");
        double keliling = 5*sisi;
        System.out.println("Keliling Bangun Datar="+keliling);
    }
    // 13. Keliling Segitiga
    static void KelilingSegitiga() {
        double a = baca("SisiSampingKanan");
        double b = baca("SisiSampingKiri");
        double c = baca("SisiSampingBawah");
        double keliling = a+b+c;
        System.out.println("Keliling="+keliling);
    }
    
    public static void main(String[] args) {
        int pilihan;
        do{
            System.out.println("\n===== MENU BANGUN DATAR =====");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Persegi");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Luas Trapesium");
            System.out.println("5. Luas Selimut Tabung");
            System.out.println("6. Luas Jajar Genjang");
            System.out.println("7. Volume Balok");
            System.out.println("8. Volume Tabung");
            System.out.println("9. Volume Kubus");
            System.out.println("10. Keliling Lingkaran");
            System.out.println("11. Keliling Persegi");
            System.out.println("12. Keliling Bangun Datar");
            System.out.println("13. Keliling Segitiga");

            System.out.print("Pilih rumus (0-13): ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    LuasSegitiga();
                    break;
                case 2:
                    LuasPersegi();
                    break;
                case 3:
                    LuasLingkaran();
                    break;
                case 4:
                    LuasTrapesium();
                    break;
                case 5:
                    LuasSelimutTabung();
                    break;
                case 6:
                    LuasJajarGenjang();
                    break;
                case 7:
                    VolumeBalok();
                    break;
                case 8:
                    VolumeTabung();
                    break;
                case 9:
                    VolumeKubus();
                    break;
                case 10:
                    KelilingLingkaran();
                    break;
                case 11:
                    KelilingPersegi();
                    break;
                case 12:
                    KelilingBangunDatar();
                    break;
                case 13:
                    KelilingSegitiga();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;

                default:
                    System.out.println("System Tidak Tersedia!.");
            }
        }while (pilihan !=0);
    }
    
    // Metode mengambil nilai pengguna
    static double baca(String pesan) {
        System.out.println("Masukkan"+pesan+":");
        return input.nextDouble();
    }
}