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

public class PSGamesController implements Initializable{
    @FXML
    ImageView PSimg1, PSimg2, PSimg3, PSimg4, PSgamebg1, PSgamebg2, PSgamebg3, PSgamebg4, PSbgimg;

    @FXML
    Label PSname1, PSname2, PSname3, PSname4, PSgenre1, PSgenre2, PSgenre3, PSgenre4,
    PSprice1, PSprice2, PSprice3, PSprice4;

    @FXML
    Button PSgamebtn1, PSgamebtn2, PSgamebtn3, PSgamebtn4, PSbackbtn;

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

        PSname1.setText(LoginController.ff7r.getGameName());
        PSprice1.setText(Double.toString(LoginController.ff7r.getGamePrice()));
        Image ff7rImage = new Image(LoginController.ff7r.getGameImage());
        PSimg1.setImage(ff7rImage);

        PSname2.setText(LoginController.re4r.getGameName());
        PSprice2.setText(Double.toString(LoginController.re4r.getGamePrice()));
        Image re4rImage = new Image(LoginController.re4r.getGameImage());
        PSimg2.setImage(re4rImage);

        PSname3.setText(LoginController.gow.getGameName());
        PSprice3.setText(Double.toString(LoginController.gow.getGamePrice()));
        Image gowImage = new Image(LoginController.gow.getGameImage());
        PSimg3.setImage(gowImage);

        PSname4.setText(LoginController.spidey.getGameName());
        PSprice4.setText(Double.toString(LoginController.spidey.getGamePrice()));
        Image spideyImage = new Image(LoginController.spidey.getGameImage());
        PSimg4.setImage(spideyImage);

    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

        //If add to cart button is pressed, check if game has no stock
        //else, set game status to true and add to cart
        if (sourceButton.equals(PSgamebtn1)) {
            if (LoginController.ff7r.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.ff7r.setGameStatus(false);
            }
            else if (LoginController.ff7r.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.ff7r.setGameStatus(true);
                LoginController.ff7r.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.PSpane1);
            }
        }

        else if (sourceButton.equals(PSgamebtn2)) {
            if (LoginController.re4r.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.re4r.setGameStatus(false);
            }
            else if (LoginController.re4r.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.re4r.setGameStatus(true);
                LoginController.re4r.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.PSpane2);
            }
        }

        else if (sourceButton.equals(PSgamebtn3)) {
            if (LoginController.gow.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.gow.setGameStatus(false);
            }
            else if (LoginController.gow.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.gow.setGameStatus(true);
                LoginController.gow.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.PSpane3);
            }
        }

        else if (sourceButton.equals(PSgamebtn4)) {
            if (LoginController.spidey.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.spidey.setGameStatus(false);
            }
            else if (LoginController.spidey.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.spidey.setGameStatus(true);
                LoginController.spidey.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.PSpane4);
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

    public void returnHome(ActionEvent event) throws IOException {
    
        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}