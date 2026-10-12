import javax.swing.*;
import java.awt.*;
import java.net.URL;

class Ultraman{
    // field
    int completed = 0;

    boolean henshin = false;

    String location = "images/";

    Image Curr = null;
    Image ultraman = loadImage(location + "Ultraman.png");
    Image change = loadImage(location + "UltramanChange.png");

    // method
    Image loadImage(String path){
        URL url = getClass().getResource(path);
        Image img = new ImageIcon(url).getImage();

        return  img;
    }
}