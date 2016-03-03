package msp;
import java.util.Scanner;
public class MSPrun {
    
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        MSP run=new MSP();
        System.out.print("Masukkan nama : ");String nm=in.nextLine();
        System.out.print("Masukkan prodi : ");String prodi=in.nextLine();
        System.out.print("Masukkan fakultas : ");String fakultas=in.nextLine();
        System.out.print("Masukkan nim : ");String nim=in.next();
        run.identitas(nm,prodi,fakultas);
        run.NIM(nim);
    }
}
