package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene loginScene = new Scene(vbox);
        primaryStage.setScene(loginScene);
        primaryStage.show();

        Label kasutajaLabel = new Label("kasutaja");
        TextField kasutajaInput = new TextField();

        Label parooliLabel = new Label("parool");
        PasswordField parooliInput = new PasswordField();

        Button loginNupp = new Button("Logi sisse");

        Label teade = new Label();

        vbox.getChildren().addAll(kasutajaLabel, kasutajaInput, parooliLabel, parooliInput, loginNupp, teade);

        loginNupp.setOnAction(event -> { //kriips ja nool värk. Kui nupule vajutati, siis mis toimub

            String kasutaja = kasutajaInput.getText();
            String parool = parooliInput.getText();

            if (kasutaja.equals("Priit")&&parool.equals("123")){
                System.out.println("said sisse");
            } else {
                teade.setText("aa");
                System.out.println("vale kasutajanimi või parool");
            }
        });


    }
}
