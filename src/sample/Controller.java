package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML Button convert = new Button();

    @FXML TextField TextFieldEuro = new TextField();
    @FXML TextField TextFieldYen = new TextField();

    public void doConvertion()
    {
        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                double x = Double.parseDouble(TextFieldEuro.getText());
                TextFieldYen.setText(String.valueOf((x)));
            }
        };
          convert.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}
