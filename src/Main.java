import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Boyut değerleri kullanıcı tarafından girilen
        0-100 arasında rastgele sayılardan oluşan tek ve çift
        sayıları ayrı ayrı dizilere aktararak yazdırma
         */

        Scanner klavye=new Scanner(System.in);
        Random rand=new Random();

        System.out.println("Matriksin satır sayısını gir");
        int satir= klavye.nextInt();
        System.out.println("Matriksin satır sayısını gir");
        int sutun= klavye.nextInt();
         System.out.println();


         int cft=0,tek=0;
        System.out.println("Matriks oluşturulup yazdırılıyor");
        int [][]matriks=new int[satir][sutun];
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                matriks[i][j]=rand.nextInt(0,100);
                if (matriks[i][j]%2==0){
                cft++;
                }
                else {
                    tek++;
                }
           System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }

        int[]tekdizi=new int[tek];
        int[] ciftdizi=new int [cft];

        int index1=0, index2=0;
        for (int i=0;i<satir;i++) {
            for (int j = 0; j < sutun; j++) {
                if (matriks[i][j]%2==0){
                    ciftdizi[index1]=matriks[i][j];
                    index1++;
                }
                else {
                    tekdizi[index2]=matriks[i][j];
                    index2++;
                }
            }
        }

        System.out.println("Matriksin çift elemanlarının dizi hali yazdırılıyor");
        for (int a:ciftdizi){
            System.out.print(a+" ");
        }
        System.out.println();

        System.out.println("Matriksin tek elemanlarının dizi hali yazdırılıyor");
        for (int b:tekdizi){
            System.out.print(b+" ");
        }





    }
}