package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double NSgame1QTY, NSgame2QTY, NSgame3QTY, NSgame4QTY,
    PSgame1QTY, PSgame2QTY, PSgame3QTY, PSgame4QTY,
    XBgame1QTY, XBgame2QTY, XBgame3QTY, XBgame4QTY;

    @FXML
    Label NSqty1, NSqty2, NSqty3, NSqty4, PSqty1, PSqty2, PSqty3, PSqty4, XBqty1, XBqty2, XBqty3, XBqty4,
    NSgame1, NSgame2, NSgame3, NSgame4, PSgame1, PSgame2, PSgame3, PSgame4, XBgame1, XBgame2, XBgame3, XBgame4,
    NSprice1, NSprice2, NSprice3, NSprice4, PSprice1, PSprice2, PSprice3, PSprice4, XBprice1, XBprice2, XBprice3, XBprice4,
    NSamount1, NSamount2, NSamount3, NSamount4, PSamount1, PSamount2, PSamount3, PSamount4, XBamount1, XBamount2, XBamount3, XBamount4,
    total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //NINTENDO
        if (LoginController.totk.getGameStatus()) {
            NSgame1.setText("NSW " + "Zelda: TOTK");
            NSqty1.setText(Double.toString(LoginController.totk.getGameQuantity()));
            NSprice1.setText(Double.toString(LoginController.totk.getGamePrice()));
            NSamount1.setText(Double.toString(LoginController.totk.getGamePrice() * LoginController.totk.getGameQuantity()));

            NSgame1.setVisible(true);
            NSqty1.setVisible(true);
            NSprice1.setVisible(true);
            NSamount1.setVisible(true);

            NSgame1QTY = LoginController.totk.getGamePrice() * LoginController.totk.getGameQuantity();

        }

        if (LoginController.ssbu.getGameStatus()) {
            NSgame2.setText("NSW " + "Smash Bros.");
            NSqty2.setText(Double.toString(LoginController.ssbu.getGameQuantity()));
            NSprice2.setText(Double.toString(LoginController.ssbu.getGamePrice()));
            NSamount2.setText(Double.toString(LoginController.ssbu.getGamePrice() * LoginController.ssbu.getGameQuantity()));

            NSgame2.setVisible(true);
            NSqty2.setVisible(true);
            NSprice2.setVisible(true);
            NSamount2.setVisible(true);

            NSgame2QTY = LoginController.ssbu.getGamePrice() * LoginController.ssbu.getGameQuantity();

        }

        if (LoginController.xc3.getGameStatus()) {
            NSgame3.setText("NSW " + "Xenoblade 3");
            NSqty3.setText(Double.toString(LoginController.xc3.getGameQuantity()));
            NSprice3.setText(Double.toString(LoginController.xc3.getGamePrice()));
            NSamount3.setText(Double.toString(LoginController.xc3.getGamePrice() * LoginController.xc3.getGameQuantity()));

            NSgame3.setVisible(true);
            NSqty3.setVisible(true);
            NSprice3.setVisible(true);
            NSamount3.setVisible(true);

            NSgame3QTY = LoginController.xc3.getGamePrice() * LoginController.xc3.getGameQuantity();

        }

        if (LoginController.pla.getGameStatus()) {
            NSgame4.setText("NSW " + "Pokemon Legends");
            NSqty4.setText(Double.toString(LoginController.pla.getGameQuantity()));
            NSprice4.setText(Double.toString(LoginController.pla.getGamePrice()));
            NSamount4.setText(Double.toString(LoginController.pla.getGamePrice() * LoginController.pla.getGameQuantity()));

            NSgame4.setVisible(true);
            NSqty4.setVisible(true);
            NSprice4.setVisible(true);
            NSamount4.setVisible(true);

            NSgame4QTY = LoginController.pla.getGamePrice() * LoginController.pla.getGameQuantity();

        }

        //PLAYSTATION
        if (LoginController.ff7r.getGameStatus()) {
            PSgame1.setText("PS4 " + "FF7 Remake");
            PSqty1.setText(Double.toString(LoginController.ff7r.getGameQuantity()));
            PSprice1.setText(Double.toString(LoginController.ff7r.getGamePrice()));
            PSamount1.setText(Double.toString(LoginController.ff7r.getGamePrice() * LoginController.ff7r.getGameQuantity()));

            PSgame1.setVisible(true);
            PSqty1.setVisible(true);
            PSprice1.setVisible(true);
            PSamount1.setVisible(true);

            PSgame1QTY = LoginController.ff7r.getGamePrice() * LoginController.ff7r.getGameQuantity();

        }

        if (LoginController.re4r.getGameStatus()) {
            PSgame2.setText("PS4 " + "RE4 Remake");
            PSqty2.setText(Double.toString(LoginController.re4r.getGameQuantity()));
            PSprice2.setText(Double.toString(LoginController.re4r.getGamePrice()));
            PSamount2.setText(Double.toString(LoginController.re4r.getGamePrice() * LoginController.re4r.getGameQuantity()));

            PSgame2.setVisible(true);
            PSqty2.setVisible(true);
            PSprice2.setVisible(true);
            PSamount2.setVisible(true);

            PSgame2QTY = LoginController.re4r.getGamePrice() * LoginController.re4r.getGameQuantity();

        }

        if (LoginController.gow.getGameStatus()) {
            PSgame3.setText("PS4 " + "GOW Ragnarok");
            PSqty3.setText(Double.toString(LoginController.gow.getGameQuantity()));
            PSprice3.setText(Double.toString(LoginController.gow.getGamePrice()));
            PSamount3.setText(Double.toString(LoginController.gow.getGamePrice() * LoginController.gow.getGameQuantity()));

            PSgame3.setVisible(true);
            PSqty3.setVisible(true);
            PSprice3.setVisible(true);
            PSamount3.setVisible(true);

            PSgame3QTY = LoginController.gow.getGamePrice() * LoginController.gow.getGameQuantity();

        }

        if (LoginController.spidey.getGameStatus()) {
            PSgame4.setText("PS4 " + "Spider-Man");
            PSqty4.setText(Double.toString(LoginController.spidey.getGameQuantity()));
            PSprice4.setText(Double.toString(LoginController.spidey.getGamePrice()));
            PSamount4.setText(Double.toString(LoginController.spidey.getGamePrice() * LoginController.spidey.getGameQuantity()));

            PSgame4.setVisible(true);
            PSqty4.setVisible(true);
            PSprice4.setVisible(true);
            PSamount4.setVisible(true);

            PSgame4QTY = LoginController.spidey.getGamePrice() * LoginController.spidey.getGameQuantity();

        }

        //XBOX    
        if (LoginController.mirage.getGameStatus()) {
            XBgame1.setText("XBOX " + "AC Mirage");
            XBqty1.setText(Double.toString(LoginController.mirage.getGameQuantity()));
            XBprice1.setText(Double.toString(LoginController.mirage.getGamePrice()));
            XBamount1.setText(Double.toString(LoginController.mirage.getGamePrice() * LoginController.mirage.getGameQuantity()));

            XBgame1.setVisible(true);
            XBqty1.setVisible(true);
            XBprice1.setVisible(true);
            XBamount1.setVisible(true);

            XBgame1QTY = LoginController.mirage.getGamePrice() * LoginController.mirage.getGameQuantity();

        }

        if (LoginController.cyber.getGameStatus()) {
            XBgame2.setText("XBOX " + LoginController.cyber.getGameName());
            XBqty2.setText(Double.toString(LoginController.cyber.getGameQuantity()));
            XBprice2.setText(Double.toString(LoginController.cyber.getGamePrice()));
            XBamount2.setText(Double.toString(LoginController.cyber.getGamePrice() * LoginController.cyber.getGameQuantity()));

            XBgame2.setVisible(true);
            XBqty2.setVisible(true);
            XBprice2.setVisible(true);
            XBamount2.setVisible(true);

            XBgame2QTY = LoginController.cyber.getGamePrice() * LoginController.cyber.getGameQuantity();

        }

        if (LoginController.halo.getGameStatus()) {
            XBgame3.setText("XBOX " + LoginController.halo.getGameName());
            XBqty3.setText(Double.toString(LoginController.halo.getGameQuantity()));
            XBprice3.setText(Double.toString(LoginController.halo.getGamePrice()));
            XBamount3.setText(Double.toString(LoginController.halo.getGamePrice() * LoginController.halo.getGameQuantity()));

            XBgame3.setVisible(true);
            XBqty3.setVisible(true);
            XBprice3.setVisible(true);
            XBamount3.setVisible(true);

            XBgame3QTY = LoginController.halo.getGamePrice() * LoginController.halo.getGameQuantity();

        }

        if (LoginController.rdr2.getGameStatus()) {
            XBgame4.setText("XBOX " + "Red Dead 2");
            XBqty4.setText(Double.toString(LoginController.rdr2.getGameQuantity()));
            XBprice4.setText(Double.toString(LoginController.rdr2.getGamePrice()));
            XBamount4.setText(Double.toString(LoginController.rdr2.getGamePrice() * LoginController.rdr2.getGameQuantity()));

            XBgame4.setVisible(true);
            XBqty4.setVisible(true);
            XBprice4.setVisible(true);
            XBamount4.setVisible(true);

            XBgame4QTY = LoginController.rdr2.getGamePrice() * LoginController.rdr2.getGameQuantity();

        }
        double final_amount = NSgame1QTY + NSgame2QTY + NSgame3QTY + NSgame4QTY +
        PSgame1QTY + PSgame2QTY + PSgame3QTY + PSgame4QTY +
        XBgame1QTY + XBgame2QTY + XBgame3QTY + XBgame4QTY;

        total.setText(Double.toString(final_amount));

    }
}