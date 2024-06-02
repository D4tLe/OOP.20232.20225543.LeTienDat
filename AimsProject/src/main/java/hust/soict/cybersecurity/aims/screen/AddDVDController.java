
package hust.soict.cybersecurity.aims.screen;

import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class AddDVDController {

    public AddDVDController() {
        super();
    }
    
    @FXML
    private TextField tfTitle;
    
    @FXML
    private TextField tfCategory;
    
    @FXML
    private TextField tfDirector;
    
    @FXML
    private TextField tfLength;
    
    @FXML
    private TextField tfCost;
            
    @FXML
    private Button btnAddDVD;
    
    @FXML
    private void addDVD() throws IOException {
        DigitalVideoDisc DVD = new DigitalVideoDisc(tfTitle.getText(), tfCategory.getText(), tfDirector.getText(), Integer.parseInt(tfLength.getText()), Float.parseFloat(tfCost.getText()));
        
        StoreScreenController.store.addMedia(DVD);
        
        AimsApp.setRoot("store");
    }
}
