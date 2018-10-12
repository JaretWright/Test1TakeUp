import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewSceneController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void  goBackButtonPushed(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "SignCreatorView.fxml","Wahoo");
    }
}
