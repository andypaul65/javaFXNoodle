import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.List;

public class Controller {

    @FXML
    VBox vbox;

    @FXML
    public void initialize() {
        List<Button> buttons = LoadStyles.createButtons();
        for(Button element: buttons) {
            vbox.getChildren().add(element);
        }

    }
}
