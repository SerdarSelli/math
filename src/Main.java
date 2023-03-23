import java.util.Scanner;

public class Main {
static void buyukKucuk(int randomm, int inputt){
    if (inputt>randomm){
        System.out.println("girdiğin sayı büyük");
    }else {
        System.out.println("girdiğin sayı küçük");
    }

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int random = (int) (Math.random()*100);
        int chance = 5 ;
        boolean isWin=false;

        while (chance>0){
            System.out.println("0 la 100 arasında bir sayı giriniz");
            int input = scan.nextInt();

            if (input<0 || input>100){
                System.out.println("hatalı sayı girdin 1 hakkın gitti");
                chance-=1;
                System.out.println("kalan hakkınız " + chance);
                continue;
            }
            chance--;
            if (input==random){
                System.out.println("sayıyı doğru tahmin ettin");
                isWin=true;
                break;
            }else {
                System.out.println("sayıyı yanlış tahmin ettin"+" kalan hakkın : "+ chance);
                System.out.println("ipucu");
                buyukKucuk(random,input);
            }
        }

        System.out.println("----------------------------------------------------");


        if (isWin){
            System.out.println("kazandınız");
        }else {
            System.out.println("kaybettiniz, gizli sayı = " + random);
        }

    }
}