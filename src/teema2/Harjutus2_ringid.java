package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni
 * 2. Joonista spiraal kasutades jooni (vaata ringi meetodi)
 * 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //kast_joontega();
        spiraal_joontega();
       // propeller();
    }
    private void kast_joontega(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();
        Line line1 = new Line(50, 50, 350,50);
        Line line2 = new Line(350, 50, 350,350);
        Line line3 = new Line(350, 350, 50,350);
        Line line4 = new Line(50, 350, 50,50);
        pane.getChildren().addAll(line1, line2, line3, line4);
    }
    private void spiraal_joontega(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400,400);
        stage.setScene(scene);
        stage.show();

        Line line1 = new Line();
        int startX = 350;
        int startY = 200;
        int endX=0;
        int endY=0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
               // Line line1 = new Line(50, 200, 50+j*50,200+i*50);
                line1.setStartX(startX);
                line1.setStartY(startY);
                line1.setEndX(startX-50);
                line1.setEndY(startY-100);
                pane.getChildren().addAll(line1);
            }

        }


    }
}
