package appaudio2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;

/**
 *
 * @author 042131009
 */
public class Controller implements Initializable {
    
    String musica1 = getClass().getResource("TheAlchemist.mp3").toString();
    String musica2 = getClass().getResource("ROCKADOWN.LIDIOP.mp3").toString();
    String musica3 = getClass().getResource("ATouchOfBlessing.mp3").toString();
    
    AudioClip clip1 = new AudioClip(musica1);
    AudioClip clip2 = new AudioClip(musica2);
    AudioClip clip3 = new AudioClip(musica3);
    
    AudioClip singles[] = {clip1, clip2, clip3};
    int index = 0;
    
    @FXML
    private void play(ActionEvent event) {
        if(singles[index].isPlaying()){
            singles[index].stop();
        } else {
            singles[index].play();
        }
    }
    
    @FXML
    private void next(ActionEvent event){
        singles[index].stop();
        try {
            index = index + 1;
            singles[index].play();
        } catch(Exception e){
            index--;
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
