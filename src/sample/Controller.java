package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    private CurrencyConverter currencyConverter;
    @FXML Button convert = new Button();
    @FXML public ChoiceBox<String> choicebox;
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

                String v = choicebox.getValue();

                double euroTo = currencyConverter.euroTo(v,x);

                TextFieldYen.setText(String.valueOf((euroTo)));
            }
        };
          convert.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
      currencyConverter = new CurrencyConverter();
        for (int i = 0; i < currencyConverter.currency.size(); i++)
        {
            choicebox.getItems().addAll(currencyConverter.getSigns(i));
        }
    }
}
