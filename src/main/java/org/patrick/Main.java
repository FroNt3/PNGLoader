package org.patrick;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {      
    public static void main (String[] args) {
        BufferedImage image =null;
        try {
            URL url = null;
            String string = "";
            for (int i=0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    string = "https://tiles.realliferpg.de/nordholm/map/3/" + i + "/" + j + ".png";
                    url = new URL(string);
                    image = ImageIO.read(url);
                    ImageIO.write(image, "png", new File("C:\\Users\\Paddy\\Desktop\\Google Drive\\Telegram Bots\\Map\\map_" + i + "_" + j + ".png"));
                }                
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}