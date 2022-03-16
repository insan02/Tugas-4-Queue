package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class contoh {
    public static void main(String[] args) {
        int i=0;
        boolean bool = true;
        String nama;

        Scanner pilih = new Scanner(System.in);
        Scanner nama1 = new Scanner(System.in);
        
        Queue<String> antrian = new LinkedList<>();
   
        System.out.println("\n==========================");
        System.out.println(" \tContoh Antrian");
        System.out.println("==========================");
                
        do{
            System.out.println("1. Jumlah Kapasitas             :");
            System.out.println("2. Tampilkan Antrian            :");
            System.out.println("3. Pemanggilan Antrian          :");
            System.out.println("4. Apakah Antrian Telah Habis?  :");
            System.out.println("5. Selesai                      :");
            System.out.println("MASUKKAN PILIHAN [1-6]: ");
            int input= pilih.nextInt();
            switch(input){
                case 1:
                    System.out.println("Masukkan Jumlah Kapasitas Antrian");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.println("Masukkan Nama : ");
                        nama= nama1.nextLine();
                        antrian.add(nama);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Nama : "+antrian);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Dipanggil antrian atas nama "+antrian.peek());
                    antrian.poll();
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Apakah antrian telah habis? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                System.err.println("Pilihan Tidak Ada!");
                System.out.println("");
                        
            }
        }
        while(bool);
    }
}
