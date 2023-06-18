package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cart;
import model.NSZelda;
import model.NSSmashBros;
import model.NSXenoblade;
import model.NSPokemon;
import model.PSFF7R;
import model.PSRE4R;
import model.PSGoW;
import model.PSSpiderman;
import model.XBACMirage;
import model.XBCP2077;
import model.XBHalo;
import model.XBRDR2;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button loginBtn;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;
    static ReceiptController receiptController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static NSZelda totk = new NSZelda();
    static NSSmashBros ssbu = new NSSmashBros();
    static NSXenoblade xc3 = new NSXenoblade();
    static NSPokemon pla = new NSPokemon();

    static PSFF7R ff7r = new PSFF7R();
    static PSRE4R re4r = new PSRE4R();
    static PSGoW gow = new PSGoW();
    static PSSpiderman spidey = new PSSpiderman();

    static XBCP2077 cyber = new XBCP2077();
    static XBHalo halo = new XBHalo();
    static XBACMirage mirage = new XBACMirage();
    static XBRDR2 rdr2 = new XBRDR2();

    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        //NINTENDO GAMES
        //The Legend Of Zelda
        totk.setGameName("The Legend of Zelda Tears of The Kingdom");
        totk.setGameGenre("Genre: Action-Adventure, Open-World");
        totk.setGamePrice(2499.00);
        totk.setGameNoStock(false);
        totk.setGameImage("images/TOTK.png");

        //Super Smash Bros.
        ssbu.setGameName("Super Smash Bros. Ultimate");
        ssbu.setGameGenre("Genre: Action, Fighting, Multiplayer");
        ssbu.setGamePrice(2495.00);
        ssbu.setGameNoStock(false);
        ssbu.setGameImage("images/SSBU.png");

        //Xenoblade
        xc3.setGameName("Xenoblade Chronicles 3");
        xc3.setGameGenre("Genre: Action RPG, Open-World");
        xc3.setGamePrice(2595.00);
        xc3.setGameNoStock(false);
        xc3.setGameImage("images/XC3.png");

        //Pokemon
        pla.setGameName("Pokemon Legends Arceus");
        pla.setGameGenre("Genre: RPG, Adventure");
        pla.setGamePrice(2495.00);
        pla.setGameNoStock(false);
        pla.setGameImage("images/PKMNLA.png");

        //PLAYSTATION GAMES
        //Final Fantasy
        ff7r.setGameName("Final Fantasy 7 Remake");
        ff7r.setGameGenre("Genre: Action-RPG, Adventure");
        ff7r.setGamePrice(1690.00);
        ff7r.setGameNoStock(false);
        ff7r.setGameImage("images/FF7R.png");

        //Resident Evil 
        re4r.setGameName("Resident Evil 4 Remake");
        re4r.setGameGenre("Genre: Survival, Horror, Action");
        re4r.setGamePrice(2990.00);
        re4r.setGameNoStock(true);
        re4r.setGameImage("images/RE4R.png");

        //God Of War
        gow.setGameName("God Of War Ragnarok");
        gow.setGameGenre("Genre: Action-Adventure");
        gow.setGamePrice(2990.00);
        gow.setGameNoStock(false);
        gow.setGameImage("images/GoW.png");

        //Spider-Man
        spidey.setGameName("Marvel's Spider-Man");
        spidey.setGameGenre("Genre: Action, Open-World");
        spidey.setGamePrice(1590.00);
        spidey.setGameNoStock(false);
        spidey.setGameImage("images/Spiderman.png");
        
        //XBOX GAMES
        //Assassin's Creed
        mirage.setGameName("Assassin's Creed Mirage");
        mirage.setGameGenre("Genre: Open-World, Stealth");
        mirage.setGamePrice(2990.00);
        mirage.setGameNoStock(true);
        mirage.setGameImage("images/ACMirage.png");

        //Cyberpunk
        cyber.setGameName("Cyberpunk 2077");
        cyber.setGameGenre("Genre: Open-World, RPG");
        cyber.setGamePrice(1050.00);
        cyber.setGameNoStock(false);
        cyber.setGameImage("images/CYBER2077.png");

        //Halo
        halo.setGameName("Halo Infinite");
        halo.setGameGenre("Genre: Open-World, FPS");
        halo.setGamePrice(2895.00);
        halo.setGameNoStock(false);
        halo.setGameImage("images/HaloInf.png");

        //Red Dead Redemption
        rdr2.setGameName("Red Dead Redemption 2");
        rdr2.setGameGenre("Genre: Action, Open-World, Western");
        rdr2.setGamePrice(1250.00);
        rdr2.setGameNoStock(false);
        rdr2.setGameImage("images/RDR2.png");

        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}
