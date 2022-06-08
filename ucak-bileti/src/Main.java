import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yol,yas,type;
        double basic;
        double sonuc;
        double i12 =0.5 , io = 0.1, iy = 0.3, iki=0.2;


        Scanner girdi = new Scanner(System.in);

        System.out.println("lutfen mesafe giriniz:");
        yol = girdi.nextInt();
        basic = yol*(0.1);
        System.out.println("lutfen yasinizi giriniz:");
        yas = girdi.nextInt();
        System.out.println("lutfen seyehat tipinizi giriniz: 1(tek yon) mi 2(gidis donus) mi?");
        type = girdi.nextInt();

        switch (type) {
            case 1 :
                if(yas>0 && yas<=12 && yol>0){
                    sonuc = basic-basic*i12;
                    System.out.println(sonuc);
                } else if (yas>12 && yas<=24 && yol>0){
                    sonuc =basic-basic*io;
                    System.out.println(sonuc);
                } else if (yas>24 && yas<65 && yol>0){
                    sonuc = basic;
                    System.out.println(sonuc);
                }else if (yas>=65 && yol>0){
                    sonuc = basic - basic*iy;
                    System.out.println(sonuc);
                } else {
                    System.out.println("gecersiz degerler girdiniz");
                }
                break;

            case 2 :
                if(yas>0 && yas<=12 && yol>0){
                    sonuc = 2*(basic-basic*i12) - 2*basic*iki;
                    System.out.println(sonuc);
                } else if (yas>12 && yas<=24 && yol>0){
                    sonuc =2*(basic-basic*io) - 2*basic*iki;
                    System.out.println(sonuc);
                } else if (yas>24 && yas<65 && yol>0){
                    sonuc = 2*basic  - 2*basic*iki;
                    System.out.println(sonuc);
                }else if (yas>=65 && yol>0){
                    sonuc = 2*(basic - basic*iy)  - 2*basic*iki;
                    System.out.println(sonuc);
                } else {
                    System.out.println("gecersiz degerler girdiniz");
                }
        }



    }
}




