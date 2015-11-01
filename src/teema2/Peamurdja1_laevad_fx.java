package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application{
    Stage lava;
    StackPane maailm;
    GridPane grid;
    //Rectangle ruut;
    int cell = 100;
    int size=2;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);

    @Override
    public void start(Stage primaryStage) throws Exception {
         lava = primaryStage;
         setupStage();
         genereeriGrid();
        reageeriKlikile();
        //kasOnLaevasid();
        //gameOver();

    }

    private void gameOver() {
        Label tekst = new Label("Tubli, võit");
        maailm.getChildren().add(tekst);
    }

    private void reageeriKlikile() {

        //Image image = new Image("pirate.png");
        //ImagePattern imagePattern = new ImagePattern(image);

        grid.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruuduID = ruut.getId();
            if(ruuduID.equals("laev")){

                ruut.setFill(laevaMuster);


                //ruut.setFill(Color.BLACK);
                ruut.setId("põhjas");


                //ruut.setFill(imagePattern);
            }else if (ruuduID.equals("meri")){

            } else if (ruuduID.equals("põhjas")){

            }

            if(!laevasidAlles()){
                System.out.println("GAMEOVER");
                gameOver();
                //System.exit(0);
            }
        });
       // ImageView imageView = new ImageView(image);

    }

    private boolean laevasidAlles() {

        for (Node ruut : grid.getChildren()){ //kui võtame lapsed välja, siis on need Noded
            if(ruut.getId().equals("laev")){
                return true;
            }
        }

        return false;
    }

    private void genereeriGrid() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Rectangle ruut = new Rectangle(cell, cell);

                int rand = (int) (Math.random()*2);
                if (rand==1){
                    ruut.setId("meri");
                    ruut.setStroke(Color.BLACK);

                }else {
                    ruut.setId("laev");
                    ruut.setStroke(Color.RED);
                }
                ruut.setFill(Color.BLUE);

                grid.add(ruut, i, j);

            }
        }

    }

    private void setupStage() {
        maailm = new StackPane();
        grid = new GridPane();

        maailm.getChildren().add(grid);

        Scene scene= new Scene(maailm,cell*size, cell*size);
        //Scene scene= new Scene(grid);
        lava.setScene(scene);
        lava.show();
        lava.setOnCloseRequest(event -> {
            System.exit(0); //lõpetab programmi, kui sulgeme akna
        });

    }
    public static int randLaev(){
        return (int) (Math.random()*2);
    }
}
