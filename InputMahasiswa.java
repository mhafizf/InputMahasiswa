import java.util.Scanner;

public class InputMahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, ps;

        System.out.println("==========Input==========");
        System.out.println("Nama: ");
        nama = in.nextLine();
        System.out.println("NIM: ");
        nim = in.nextLine();
        System.out.println("Program Studi: ");
        ps = in.nextLine();
        System.out.println();
        System.out.println("==========Output==========");
        System.out.println("Hi "+nama+", Anda terdaftar dengan "+nim+",dari "+ps+"");
    }
}
