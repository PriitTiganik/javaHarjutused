package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */

public class Peamurdja2_ristmik3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foorv = new Foor(Foor.VASAK, primaryStage);
        Foor foorp = new Foor(Foor.PAREM, primaryStage);
        Foor foory = new Foor(Foor.YLEMINE, primaryStage);
        Foor foora = new Foor(Foor.ALUMINE, primaryStage);

        punane(foorv);
        punane(foorp);
        punane(foory);
        punane(foora);

        int i = 0;
        while (i < 3) {
            tsykkel(foorv);
            tsykkel(foorp);
            foory.paus(6);
            foora.paus(6);
            tsykkel(foory);
            tsykkel(foora);
            foorv.paus(6);
            foorp.paus(6);
            i = i + 1;
        }
    }

    public void punane(Foor foor) {
        foor.vahetaPunast();
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
}

