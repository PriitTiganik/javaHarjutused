package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 *
 * javafx programm
 *
 * //vali sisu kood, refractor, extract, method: teeb valitud koodist uue meetodi koos kõikide vajalike viledega
 */
public class Harjutus1_lipud extends Application { //javafx tarvis extends, impordib sisse ka alguses
    @Override //kirjutab üle applicationis oleva meetodi, vajalik värk. See meetod on ülekirjutaja
    public void start(Stage primaryStage) throws Exception { // starti vaja kui extendime. annab kaasa Stage

        eestilipp();//primaryStage eemaldatud ja lisatud lava Stage

        jaapanilipp(primaryStage);

    }

    private void jaapanilipp(Stage primaryStage) {
        Pane pane2 = new Pane();//alguses vaja paneeli, võige väiksemat elementi
        Scene stseen2 = new Scene(pane2, 300,300); //stseeni sees on paneel. Stseeni suurus
        primaryStage.setScene(stseen2); //stage sees on stseen
        primaryStage.show(); //näita

        Circle ring = new Circle(150,150,75);
        ring.setFill(Color.RED);
        pane2.getChildren().add(ring);
    }

    private void eestilipp() {
        Stage lava = new Stage(); //ehitame suure lava
        Pane pane = new Pane();//alguses vaja paneeli, võige väiksemat elementi
        Scene stseen = new Scene(pane, 600,300); //stseeni sees on paneel. Stseeni suurus
        lava.setScene(stseen); //stage sees on stseen
        lava.show(); //näita

        Rectangle sinine = new Rectangle(0,0,600,100);
        sinine.setFill(Color.BLUE);

        Rectangle must = new Rectangle(0,100,600,100);
        must.setFill(Color.BLACK);

        pane.getChildren().addAll(sinine, must);
    }

}
