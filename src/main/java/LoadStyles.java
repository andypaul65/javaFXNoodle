import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andy on 11/10/2017.
 */
public class LoadStyles {


    public static final String[] STYLES = new String[] {
            "green", "round-red", "bevel-grey", "glass-grey", "shiny-orange", "dark-blue", "record-sales",
            "rich-blue", "big-yellow", "iphone-toolbar", "iphone", "ipad-dark-grey", "lion-default", "lion",
            "windows7-default", "windows7"};



    public static List<Button> createButtons() {
        List<Button> buttons = new ArrayList<Button>();
        for (int i = 0; i < STYLES.length; i++) {
            String style = STYLES[i];
            Button button = new Button(style);
            button.getStyleClass().add(style);
            buttons.add(button);
        }
        return buttons;
    }

}


//    green
//    round-red
//    bevel-grey
//    glass-grey
//    shiny-orange
//    dark-blue
//    dark-blue Text
//    record-sales
//    record-sales:hover
//    record-sales:pressed
//    record-sales Text
//    rich-blue
//    rich-blue Text
//    big-yellow
//    big-yellow Text
//    iphone-toolbar
//            iphone
//    iphone Text
//    ipad-dark-grey
//    ipad-dark-grey Text
//    ipad-grey
//    ipad-grey Text
//    lion-default
//    lion
//    windows7-default
//    windows7
