import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignCreatorViewController implements Initializable {

    @FXML
    private Label msgLabel;

    @FXML
    private TextField widthTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private TextArea messageTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        msgLabel.setText("");
    }

    @FXML
    public void createSignButtonPushed()
    {
        msgLabel.setText("");
        if (testFieldsForInputs()) {
            try {

                Sign newSign = new Sign(messageTextArea.getText(),
                        Integer.parseInt(heightTextField.getText()),
                        Integer.parseInt(widthTextField.getText()));

                msgLabel.setText(newSign.toString());
            } catch (Exception e) {
                msgLabel.setText(e.getMessage());
            }
        }
    }

    /**
     * This method will check each of the fields in the GUI to ensure they have valid inputs
     */
    public boolean testFieldsForInputs()
    {
        msgLabel.setText("");

        try{
            Integer.parseInt(heightTextField.getText());
        }
        catch (Exception e)
        {
            msgLabel.setText("Height field must contain a number\n");
        }

        try{
            Integer.parseInt(widthTextField.getText());
        }
        catch (Exception e)
        {
            String msg = msgLabel.getText();
            msgLabel.setText(msg + "Width field must contain a number\n");
        }

        if (messageTextArea.getText().isEmpty())
        {
            String msg = msgLabel.getText();
            msgLabel.setText(msg + "message cannot be empty");
        }
        return msgLabel.getText().isEmpty();
    }

    public void changeSceneButtonPushed(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "NewScene.fxml", "We did it");
    }
}
