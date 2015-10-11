package teema1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {//pswm main methodi saamiseks

        int[] laevastik = new int [4];

        for(int i=0;i < laevastik.length;i++){
            laevastik[i]= randLaev();
            //int random = (int) Math.round(Math.random());
        }

        System.out.println(Arrays.toString(laevastik));

        int laevad = 1;

        while (laevad>0) {
            System.out.println("pommita laeva nr");
            Scanner kasutaja = new Scanner(System.in);
            //kontroll, kas sisestas õigesti

            int sisestus = kasutaja.nextInt() - 1;


            if (laevastik[sisestus] == 1) {
                System.out.println("said laevale pihta");
                laevastik[sisestus] = -1;
            } else if (laevastik[sisestus] == -1) {
                System.out.println("juba pommitasid siia");
            } else {
                System.out.println("mööda");
            }

            System.out.println(Arrays.toString(laevastik));

            //Priidu lahendus
            /*
            if (getMaxValue(laevastik)==0){
                laevad=0;
                System.out.println("kõik laevad põhjas, hea töö!");
            }*/

            //või Kristeri lahendus
            if(gameover(laevastik) == true) {
                laevad =0;
                System.out.println("kõik laevad põhjas, hea töö!");
            }
            //
        }
    }


    public static boolean gameover(int[] laevastik){
        for (int i = 0; i < laevastik.length ; i++) {
            if(laevastik[i]==1){
                return false;
            }
        }
        return true;
    }

    public static int randLaev(){
        return (int) (Math.random()*2);
    }

    // getting the miniumum value
    public static int getMinValue(int[] array){
        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }


    // getting the maximum value
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for(int i=1;i < array.length;i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}