package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */

public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foorv = new Foor(Foor.VASAK, primaryStage);
        Foor foorp = new Foor(Foor.PAREM, primaryStage);
        Foor foory = new Foor(Foor.YLEMINE, primaryStage);
        Foor foora = new Foor(Foor.ALUMINE, primaryStage);
/*
        punane(foorv);
        punane(foorp);
        punane(foory);
        punane(foora);
*/
        int i = 0;
        while (i<2) {
            vertikaal(foory);
            vertikaal(foora);
            //horisontaal(foorv, foorp);
            i ++;
        }
    }

    public void punane(Foor foor) {
        foor.vahetaPunast();
    }




    public void rohelisestPunaseks(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(2);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.kustutaRoheline();
        foor.syytaKollane();
        foor.paus(0.5);
        foor.syytaPunane();
        foor.vahetaKollast();
        foor.paus(1);

    }

    public void punasestRoheliseks(Foor foor){
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);


        foor.paus(4.5);
        foor.vahetaPunast();
        foor.syytaKollane();
        foor.paus(1);
        foor.kustutaKollane();
        foor.vahetaPunast();
        foor.vahetaRohelist();
    }
    public void vertikaal(Foor foor1){
        foor1.vahetaRohelist();
        rohelisestPunaseks(foor1);
        foor1.paus(1);
        punasestRoheliseks(foor1);
        foor1.paus(1);
    }
    public void horisontaal(Foor foor1, Foor foor2){
        foor1.vahetaPunast();
        punasestRoheliseks(foor1);
        foor1.paus(1);
        rohelisestPunaseks(foor1);
        foor1.paus(1);
    }
 //

}

/*
        int i=0;
        while (i <3)   {
            tsykkel(foorv);
            tsykkel(foorp);
            foory.paus(6);
            foora.paus(6);
            tsykkel(foory);
            tsykkel(foora);
            foorv.paus(6);
            foorp.paus(6);
            i = i+1;
        }
    }


    public void tsykkel(Foor foor) {
        foor.paus(1);
        foor.syytaKollane();
        foor.paus(1);
        foor.kustutaKollane();
        foor.vahetaPunast();
        foor.vahetaRohelist();
        foor.paus(2);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.kustutaRoheline();
        foor.syytaKollane();
        foor.paus(0.5);
        foor.syytaPunane();
        foor.kustutaKollane();
    }

*/