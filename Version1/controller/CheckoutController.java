package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane NSpane1, NSpane2, NSpane3, NSpane4, PSpane1, PSpane2, PSpane3, PSpane4, XBpane1, XBpane2, XBpane3, XBpane4,
    totalpane;

    @FXML
    VBox myvbox;

    @FXML
    Label NSname1, NSname2, NSname3, NSname4, PSname1, PSname2, PSname3, PSname4, XBname1, XBname2, XBname3, XBname4, 
    NSprice1, NSprice2, NSprice3, NSprice4, PSprice1, PSprice2, PSprice3, PSprice4, XBprice1, XBprice2, XBprice3, XBprice4,
    NStotal1, NStotal2, NStotal3, NStotal4, PStotal1, PStotal2, PStotal3, PStotal4, XBtotal1, XBtotal2, XBtotal3, XBtotal4, total;

    @FXML
    ImageView NSimg1, NSimg2, NSimg3, NSimg4, PSimg1, PSimg2, PSimg3, PSimg4, XBimg1, XBimg2, XBimg3, XBimg4;

    @FXML
    private ChoiceBox<String> NSchoicebox1, NSchoicebox2, NSchoicebox3, NSchoicebox4,
    PSchoicebox1, PSchoicebox2, PSchoicebox3, PSchoicebox4,
    XBchoicebox1, XBchoicebox2, XBchoicebox3, XBchoicebox4;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //NS
        NSname1.setText(LoginController.totk.getGameName());
        NSprice1.setText(Double.toString(LoginController.totk.getGamePrice()));
        Image zeldaImage = new Image(LoginController.totk.getGameImage());
        NSimg1.setImage(zeldaImage);

        NSname2.setText(LoginController.ssbu.getGameName());
        NSprice2.setText(Double.toString(LoginController.ssbu.getGamePrice()));
        Image smashImage = new Image(LoginController.ssbu.getGameImage());
        NSimg2.setImage(smashImage);
        
        NSname3.setText(LoginController.xc3.getGameName());
        NSprice3.setText(Double.toString(LoginController.xc3.getGamePrice()));
        Image xenoImage = new Image(LoginController.xc3.getGameImage());
        NSimg3.setImage(xenoImage);

        NSname4.setText(LoginController.pla.getGameName());
        NSprice4.setText(Double.toString(LoginController.pla.getGamePrice()));
        Image pkmnImage = new Image(LoginController.pla.getGameImage());
        NSimg4.setImage(pkmnImage);

        //PS
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

        //XB
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

        // Set default quantities in choicebox to 1
        NSchoicebox1.setValue("1");
        NSchoicebox2.setValue("1");
        NSchoicebox3.setValue("1");
        NSchoicebox4.setValue("1");

        PSchoicebox1.setValue("1");
        PSchoicebox2.setValue("1");
        PSchoicebox3.setValue("1");
        PSchoicebox4.setValue("1");

        XBchoicebox1.setValue("1");
        XBchoicebox2.setValue("1");
        XBchoicebox3.setValue("1");
        XBchoicebox4.setValue("1");

        // Insert quantity array to choicebox
        NSchoicebox1.getItems().addAll(quantity);
        NSchoicebox2.getItems().addAll(quantity);
        NSchoicebox3.getItems().addAll(quantity);
        NSchoicebox4.getItems().addAll(quantity);
        
        PSchoicebox1.getItems().addAll(quantity);
        PSchoicebox2.getItems().addAll(quantity);
        PSchoicebox3.getItems().addAll(quantity);
        PSchoicebox4.getItems().addAll(quantity);

        XBchoicebox1.getItems().addAll(quantity);
        XBchoicebox2.getItems().addAll(quantity);
        XBchoicebox3.getItems().addAll(quantity);
        XBchoicebox4.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        NSchoicebox1.setOnAction(this::computeTotal);
        NSchoicebox2.setOnAction(this::computeTotal);
        NSchoicebox3.setOnAction(this::computeTotal);
        NSchoicebox4.setOnAction(this::computeTotal);

        PSchoicebox1.setOnAction(this::computeTotal);
        PSchoicebox2.setOnAction(this::computeTotal);
        PSchoicebox3.setOnAction(this::computeTotal);
        PSchoicebox4.setOnAction(this::computeTotal);

        XBchoicebox1.setOnAction(this::computeTotal);
        XBchoicebox2.setOnAction(this::computeTotal);
        XBchoicebox3.setOnAction(this::computeTotal);
        XBchoicebox4.setOnAction(this::computeTotal);

    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double NSgame1QTY = 0;
        double NSgame2QTY = 0;
        double NSgame3QTY = 0;
        double NSgame4QTY = 0;

        double PSgame1QTY = 0;
        double PSgame2QTY = 0;
        double PSgame3QTY = 0;
        double PSgame4QTY = 0;

        double XBgame1QTY = 0;
        double XBgame2QTY = 0;
        double XBgame3QTY = 0;
        double XBgame4QTY = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        // Nintendo
        if (LoginController.totk.getGameStatus()) {

            double qty = Double.parseDouble(NSchoicebox1.getValue());
            LoginController.totk.setGameQuantity(qty);
            NSgame1QTY = LoginController.totk.getGamePrice() * qty;

            if (source == NSchoicebox1) {
                NSgame1QTY = LoginController.totk.getGamePrice() * qty;
            }
        }

        if (LoginController.ssbu.getGameStatus()) {

            double qty = Double.parseDouble(NSchoicebox2.getValue());
            LoginController.ssbu.setGameQuantity(qty);
            NSgame2QTY = LoginController.ssbu.getGamePrice() * qty;

            if (source == NSchoicebox2) {
                NSgame2QTY = LoginController.ssbu.getGamePrice() * qty;
            }
        }

        if (LoginController.xc3.getGameStatus()) {

            double qty = Double.parseDouble(NSchoicebox3.getValue());
            LoginController.xc3.setGameQuantity(qty);
            NSgame3QTY = LoginController.xc3.getGamePrice() * qty;

            if (source == NSchoicebox3) {
                NSgame3QTY = LoginController.xc3.getGamePrice() * qty;
            }
        }

        if (LoginController.pla.getGameStatus()) {

            double qty = Double.parseDouble(NSchoicebox4.getValue());
            LoginController.pla.setGameQuantity(qty);
            NSgame4QTY = LoginController.pla.getGamePrice() * qty;

            if (source == NSchoicebox4) {
                NSgame4QTY = LoginController.pla.getGamePrice() * qty;
            }
        }

        //Playstation
        if (LoginController.ff7r.getGameStatus()) {

            double qty = Double.parseDouble(PSchoicebox1.getValue());
            LoginController.ff7r.setGameQuantity(qty);
            PSgame1QTY = LoginController.ff7r.getGamePrice() * qty;

            if (source == PSchoicebox1) {
                PSgame1QTY = LoginController.ff7r.getGamePrice() * qty;
            }
        }

        if (LoginController.re4r.getGameStatus()) {

            double qty = Double.parseDouble(PSchoicebox2.getValue());
            LoginController.re4r.setGameQuantity(qty);
            PSgame2QTY = LoginController.re4r.getGamePrice() * qty;

            if (source == PSchoicebox2) {
                PSgame2QTY = LoginController.re4r.getGamePrice() * qty;
            }
        }

        if (LoginController.gow.getGameStatus()) {

            double qty = Double.parseDouble(PSchoicebox3.getValue());
            LoginController.gow.setGameQuantity(qty);
            PSgame3QTY = LoginController.gow.getGamePrice() * qty;

            if (source == PSchoicebox3) {
                PSgame3QTY = LoginController.gow.getGamePrice() * qty;
            }
        }

        if (LoginController.spidey.getGameStatus()) {

            double qty = Double.parseDouble(PSchoicebox4.getValue());
            LoginController.spidey.setGameQuantity(qty);
            PSgame4QTY = LoginController.spidey.getGamePrice() * qty;

            if (source == PSchoicebox4) {
                PSgame4QTY = LoginController.spidey.getGamePrice() * qty;
            }
        }

        //Xbox
        if (LoginController.mirage.getGameStatus()) {

            double qty = Double.parseDouble(XBchoicebox1.getValue());
            LoginController.mirage.setGameQuantity(qty);
            XBgame1QTY = LoginController.mirage.getGamePrice() * qty;

            if (source == XBchoicebox1) {
                XBgame1QTY = LoginController.mirage.getGamePrice() * qty;
            }
        }

        if (LoginController.cyber.getGameStatus()) {

            double qty = Double.parseDouble(XBchoicebox2.getValue());
            LoginController.cyber.setGameQuantity(qty);
            XBgame2QTY = LoginController.cyber.getGamePrice() * qty;

            if (source == XBchoicebox2) {
                XBgame2QTY = LoginController.cyber.getGamePrice() * qty;
            }
        }

        if (LoginController.halo.getGameStatus()) {

            double qty = Double.parseDouble(XBchoicebox3.getValue());
            LoginController.halo.setGameQuantity(qty);
            XBgame3QTY = LoginController.halo.getGamePrice() * qty;

            if (source == XBchoicebox3) {
                XBgame3QTY = LoginController.halo.getGamePrice() * qty;
            }
        }

        if (LoginController.rdr2.getGameStatus()) {

            double qty = Double.parseDouble(XBchoicebox4.getValue());
            LoginController.rdr2.setGameQuantity(qty);
            XBgame4QTY = LoginController.rdr2.getGamePrice() * qty;

            if (source == XBchoicebox4) {
                XBgame4QTY = LoginController.rdr2.getGamePrice() * qty;
            }
        }
        //Show total amount of each game
        NStotal1.setText(Double.toString(NSgame1QTY));
        NStotal2.setText(Double.toString(NSgame2QTY));
        NStotal3.setText(Double.toString(NSgame3QTY));
        NStotal4.setText(Double.toString(NSgame4QTY));

        PStotal1.setText(Double.toString(PSgame1QTY));
        PStotal2.setText(Double.toString(PSgame2QTY));
        PStotal3.setText(Double.toString(PSgame3QTY));
        PStotal4.setText(Double.toString(PSgame4QTY));

        XBtotal1.setText(Double.toString(XBgame1QTY));
        XBtotal2.setText(Double.toString(XBgame2QTY));
        XBtotal3.setText(Double.toString(XBgame3QTY));
        XBtotal4.setText(Double.toString(XBgame4QTY));

        // Compute total amount for all items chosen
        totalAmount = NSgame1QTY + NSgame2QTY + NSgame3QTY + NSgame4QTY +
        PSgame1QTY + PSgame2QTY + PSgame3QTY + PSgame4QTY +
        XBgame1QTY + XBgame2QTY + XBgame3QTY + XBgame4QTY;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;
        //Nintendo
        if (LoginController.totk.getGameStatus()) {
            totalAmount += LoginController.totk.getGamePrice();
        }

        if (LoginController.ssbu.getGameStatus()) {
            totalAmount += LoginController.ssbu.getGamePrice();
        }

        if (LoginController.xc3.getGameStatus()) {
            totalAmount += LoginController.xc3.getGamePrice();
        }

        if (LoginController.pla.getGameStatus()) {
            totalAmount += LoginController.pla.getGamePrice();
        }

        //Playstation
        if (LoginController.ff7r.getGameStatus()) {
            totalAmount += LoginController.ff7r.getGamePrice();
        }

        if (LoginController.re4r.getGameStatus()) {
            totalAmount += LoginController.re4r.getGamePrice();
        }

        if (LoginController.gow.getGameStatus()) {
            totalAmount += LoginController.gow.getGamePrice();
        }

        if (LoginController.spidey.getGameStatus()) {
            totalAmount += LoginController.spidey.getGamePrice();
        }
        
        //Xbox
        if (LoginController.mirage.getGameStatus()) {
            totalAmount += LoginController.mirage.getGamePrice();
        }

        if (LoginController.cyber.getGameStatus()) {
            totalAmount += LoginController.cyber.getGamePrice();
        }

        if (LoginController.halo.getGameStatus()) {
            totalAmount += LoginController.halo.getGamePrice();
        }

        if (LoginController.rdr2.getGameStatus()) {
            totalAmount += LoginController.rdr2.getGamePrice();
        }

        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ThankYou.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}