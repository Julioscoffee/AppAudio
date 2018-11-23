package appaudio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppAudio2 extends Application {
    
    @Override
    public void start(Stage palco) throws Exception {
        Parent historia = FXMLLoader.load(getClass().getResource("Tela.fxml"));
        
        Scene cena = new Scene(historia);
        
        palco.setScene(cena);
        palco.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
