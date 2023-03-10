
package desafio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Cadastro extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Layout-css.css").toExternalForm());
        
        stage.setScene(scene);
        stage.setTitle("Sistema de Cadastro");
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
