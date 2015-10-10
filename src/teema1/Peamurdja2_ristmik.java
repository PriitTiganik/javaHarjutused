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

        Foor foorvasak = new Foor(Foor.VASAK, primaryStage);
        Foor foorparem = new Foor(Foor.PAREM, primaryStage);
        Foor foor = foorvasak;
        foor = foorparem;
        // viis tsüklit
        int i=0;

        while (i <2)   {
            foor.syytaPunane();
            foor.paus(2);
            foor.syytaKollane();
            foor.paus(0.5);
            foor.kustutaPunane();
            foor.kustutaKollane();

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
            i = i+1;
        }
    }

}
