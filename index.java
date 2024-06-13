import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi skor awal
        int score = 0;

        System.out.println("Selamat datang di Kuis Sederhana!");
        System.out.println("Jawablah pertanyaan berikut:");

        // Pertanyaan 1
        System.out.println("1. Apa ibu kota Indonesia?");
        System.out.println("a) Jakarta");
        System.out.println("b) Bandung");
        System.out.println("c) Surabaya");

        // Menerima jawaban dari pengguna
        System.out.print("Jawaban Anda (a/b/c): ");
        String jawaban1 = input.nextLine();

        // Memeriksa jawaban pertanyaan 1
        if (jawaban1.equalsIgnoreCase("a")) {
            System.out.println("Benar!");
            score++;
        } else {
            System.out.println("Salah. Jawaban yang benar adalah Jakarta.");
        }

        // Pertanyaan 2 
        System.out.println("2 apa nama Buah Yang berbentuk seperti bintang ");
        System.out.println("a) NaNas");
        System.out.println("b) Belimbing");
        System.out.println("c) Semangka");

        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban2 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 2 
        if (jawaban2.equalsIgnoreCase("b")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Belimbing ");
        }

        // Pertanyaan 3
        System.out.println("3 apa nama salah satu Game Karya Mojiken Studio  ");
        System.out.println("a) Call of Duty");
        System.out.println("b) A Space For The Unbound");
        System.out.println("c) Lego");

        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban3 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 3
        if (jawaban3.equalsIgnoreCase("b")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah A Space For The Unbound ");
        }

        // Pertanyaan 4
        System.out.println("4 Apa Nama Ibukota JawaBarat ");
        System.out.println("a) Depok");
        System.out.println("b) Bogor");
        System.out.println("c) Bandung");

        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban4 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 2 
        if (jawaban4.equalsIgnoreCase("c")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Bandung ");
        }
        
        // Pertanyaan 5
        System.out.println("5  Apa Salah Satu Bahasa Pemograman Berikut ini ");
        System.out.println("a) JavaScript");
        System.out.println("b) SSD");
        System.out.println("c) RAM");

        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban5 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 5
        if (jawaban5.equalsIgnoreCase("a")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah JavaScript ");
        }
        
        // Pertanyaan 6 
        System.out.println("6  Presidden ke-1 indonesia ");
        System.out.println("a) James Naismith");
        System.out.println("b) Jokowi Dodo");
        System.out.println("c) Hirohito");
        System.out.println("d) Ir Soekarno");
       
        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban6 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 6
         if (jawaban6.equalsIgnoreCase("d")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah IR Soekarno ");
        }
       
         // Pertanyaan 7
        System.out.println("7  Perusahaan Game Terkenal Asal Jepang Ialah");
        System.out.println("a) Moonton");
        System.out.println("b) Nintendo");
        System.out.println("c) Garena");
        System.out.println("d) Playstation");
       
        // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban7 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 7
         if (jawaban7.equalsIgnoreCase("b")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Nintendo ");
        }
       
       // Pertanyaan 8 
       System.out.println("8 Siapa Presiden ke 2 Indonesia");
       System.out.println("a) Jiro");
       System.out.println("b) Soeharto");
       System.out.println("c) Abraham Linlcoln");
       System.out.println("d) Raffi Ahmad");

       // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban8 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 8
         if (jawaban8.equalsIgnoreCase("c")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Soeharto ");
        }
       
       // Pertanyaan 9
       System.out.println("9 Hewan Yang Menyusui Disebut");
       System.out.println("a) Mamamia");
       System.out.println("b) Vertebrata");
       System.out.println("c) Mamalia");
       System.out.println("d) Herbivora");

       // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban9 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 9
         if (jawaban9.equalsIgnoreCase("b")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Mamalia ");
        }

        
       // Pertanyaan 10
       System.out.println("9 Hewan Yang Pemakan Segalanya Disebut");
       System.out.println("a) Omnivora");
       System.out.println("b) Hebivora");
       System.out.println("c) Karnivora");
       System.out.println("d) Amfibi");

       // Menerima Jawaban Dari Pengguna 
        System.out.println("Jawaban Anda (a/b/c): ");
        String jawaban10 = input.nextLine();

        //Memeriksa Jawaban Pertanyaan 10
         if (jawaban10.equalsIgnoreCase("b")){
            System.out.println("Benar !");
            score++;
        }else{
            System.out.println("salah Yang benar Adalah Omnivora ");
        }

        //CLEAR
     
        


        // Menampilkan skor akhir
        System.out.println("Skor Anda: " + score + " dari 10  pertanyaan.");
        input.close();

    }
}
