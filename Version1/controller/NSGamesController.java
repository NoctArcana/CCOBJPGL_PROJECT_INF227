package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class NSGamesController implements Initializable{
    @FXML
    ImageView NSimg1, NSimg2, NSimg3, NSimg4, NSgamebg1, NSgamebg2, NSgamebg3, NSgamebg4, NSbgimg;

    @FXML
    Label NSname1, NSname2, NSname3, NSname4, NSgenre1, NSgenre2, NSgenre3, NSgenre4,
    NSprice1, NSprice2, NSprice3, NSprice4;

    @FXML
    Button NSgamebtn1, NSgamebtn2, NSgamebtn3, NSgamebtn4, NSbackbtn, NScartbtn;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent homeRoot = null;

    FXMLLoader loader;

    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        NSname1.setText(LoginController.totk.getGameName());
        NSprice1.setText(Double.toString(LoginController.totk.getGamePrice()));
        Image zeldaTOTK = new Image(LoginController.totk.getGameImage());
        NSimg1.setImage(zeldaTOTK);
        
        NSname2.setText(LoginController.ssbu.getGameName());
        NSprice2.setText(Double.toString(LoginController.ssbu.getGamePrice()));
        Image smashBros = new Image(LoginController.ssbu.getGameImage());
        NSimg2.setImage(smashBros);

        NSname3.setText(LoginController.xc3.getGameName());
        NSprice3.setText(Double.toString(LoginController.xc3.getGamePrice()));
        Image xenoBlade3 = new Image(LoginController.xc3.getGameImage());
        NSimg3.setImage(xenoBlade3);

        NSname4.setText(LoginController.pla.getGameName());
        NSprice4.setText(Double.toString(LoginController.pla.getGamePrice()));
        Image pkmnLegends = new Image(LoginController.pla.getGameImage());
        NSimg4.setImage(pkmnLegends);

    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

        //If add to cart button is pressed, check if game has no stock
        //else if for when game status is already set to true
        //else, set game status to true and add to cart
        if (sourceButton.equals(NSgamebtn1)) {
            if (LoginController.totk.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.totk.setGameStatus(false);
            }
            else if (LoginController.totk.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.totk.setGameStatus(true);
                LoginController.totk.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.NSpane1);
            }
        }

        else if (sourceButton.equals(NSgamebtn2)) {
            if (LoginController.ssbu.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.ssbu.setGameStatus(false);
            }
            else if (LoginController.ssbu.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.ssbu.setGameStatus(true);
                LoginController.ssbu.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.NSpane2);
            }
        }

        else if (sourceButton.equals(NSgamebtn3)) {
            if (LoginController.xc3.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.xc3.setGameStatus(false);
            }
            else if (LoginController.xc3.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.xc3.setGameStatus(true);
                LoginController.xc3.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.NSpane3);
            }
        }

        else if (sourceButton.equals(NSgamebtn4)) {
            if (LoginController.pla.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.pla.setGameStatus(false);
            }
            else if (LoginController.pla.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.pla.setGameStatus(true);
                LoginController.pla.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.NSpane4);
            }
        }

        LoginController.cart.showItems();
    }

    public void gotocart(ActionEvent event) throws IOException {

        // Load games to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //Method for returning to Home.fxml
    public void returnHome(ActionEvent event) throws IOException {
    
        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}