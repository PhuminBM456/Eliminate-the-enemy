import javax.swing.*;
import java.awt.*;
import java.net.URL;

class Inazuma{
    // field
    int completed = 0;
    boolean henshin = false;
    String location = "images/";
    Image Curr = null;
    Image inazuma = loadImage(location + "Inazuma.png");
    Image InazumaWebL = loadImage(location + "InazumaWebL.png");
    Image InazumaWebR = loadImage(location + "InazumaWebR.png");
    Image change = loadImage(location + "Change.png");

    // method
    Image loadImage(String path){
        URL url = getClass().getResource(path);
        Image img = new ImageIcon(url).getImage();

        return  img;
    }
}