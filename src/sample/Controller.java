package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Date;
import java.util.Random;


public class Controller {

    @FXML
    ImageView Billede;
    @FXML
    TextArea Text;

    public void hej() {
        // System.out.println("Hej"); den her ville sout ud i console i Intllij
        Text.appendText("Hej \n"); // Den her souter ud i programet når jeg har forbundet knappen med methoden
    }

    public void tid() {
        Date tid = new Date();
        System.out.println(tid);
        Text.appendText(tid.toString() + "\n");

    }

    public void terning() {
        int random = ((int) (Math.random() * 6) + 1);
        String s = String.valueOf(random);
        Text.appendText("Terningen viser " + s + "\n");

    }

    public void terningBillede() {

        int random = ((int) (Math.random() * 6) + 1);

        if (random == 1) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00618-300.png");
            Billede.setImage(i);
        } else if (random == 2) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00619-300.png");
            Billede.setImage(i);
        } else if (random == 3) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00620-300.png");
            Billede.setImage(i);
        } else if (random == 4) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00621-300.png");
            Billede.setImage(i);
        } else if (random == 5) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00622-300.png");
            Billede.setImage(i);
        } else if (random == 6) {
            Image i = new Image("http://www.gratisskole.dk/sdata/minipic/006/00623-300.png");
            Billede.setImage(i);
        }
    }
}
