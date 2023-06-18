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

public class XBGamesController implements Initializable{
    @FXML
    ImageView XBimg1, XBimg2, XBimg3, XBimg4, XBgamebg1, XBgamebg2, XBgamebg3, XBgamebg4, XBbgimg;

    @FXML
    Label XBname1, XBname2, XBname3, XBname4, XBgenre1, XBgenre2, XBgenre3, XBgenre4,
    XBprice1, XBprice2, XBprice3, XBprice4;

    @FXML
    Button XBgamebtn1, XBgamebtn2, XBgamebtn3, XBgamebtn4, XBbackbtn;

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

        XBname1.setText(LoginController.mirage.getGameName());
        XBprice1.setText(Double.toString(LoginController.mirage.getGamePrice()));
        Image mirageImage = new Image(LoginController.mirage.getGameImage());
        XBimg1.setImage(mirageImage);

        XBname2.setText(LoginController.cyber.getGameName());
        XBprice2.setText(Double.toString(LoginController.cyber.getGamePrice()));
        Image cyberImage = new Image(LoginController.cyber.getGameImage());
        XBimg2.setImage(cyberImage);

        XBname3.setText(LoginController.halo.getGameName());
        XBprice3.setText(Double.toString(LoginController.halo.getGamePrice()));
        Image haloImage = new Image(LoginController.halo.getGameImage());
        XBimg3.setImage(haloImage);

        XBname4.setText(LoginController.rdr2.getGameName());
        XBprice4.setText(Double.toString(LoginController.rdr2.getGamePrice()));
        Image rdr2Image = new Image(LoginController.rdr2.getGameImage());
        XBimg4.setImage(rdr2Image);

    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();

        //If add to cart button is pressed, check if game has no stock
        //else, set game status to true and add to cart
        if (sourceButton.equals(XBgamebtn1)) {
            if (LoginController.mirage.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.mirage.setGameStatus(false);
            }
            else if (LoginController.mirage.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.mirage.setGameStatus(true);
                LoginController.mirage.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.XBpane1);
            }

        }

        else if (sourceButton.equals(XBgamebtn2)) {
            if (LoginController.cyber.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.cyber.setGameStatus(false);
            }
            else if (LoginController.cyber.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.cyber.setGameStatus(true);
                LoginController.cyber.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.XBpane2);
            }
        }

        else if (sourceButton.equals(XBgamebtn3)) {
            if (LoginController.halo.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.halo.setGameStatus(false);
            }
            else if (LoginController.halo.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.halo.setGameStatus(true);
                LoginController.halo.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.XBpane3);
            }
        }

        else if (sourceButton.equals(XBgamebtn4)) {
            if (LoginController.rdr2.getGameNoStock()) {
                AlertMaker.showSimpleAlert("hello", "This game is out of stock");
                LoginController.rdr2.setGameStatus(false);
            }
            else if (LoginController.rdr2.getGameStatus()){
                AlertMaker.showSimpleAlert("hello", "This game is already in your cart");
            }
            else{
                AlertMaker.showSimpleAlert("hello", "game added");
                LoginController.rdr2.setGameStatus(true);
                LoginController.rdr2.setGameQuantity(1);
                LoginController.cart.addItem(LoginController.checkoutController.XBpane4);
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
