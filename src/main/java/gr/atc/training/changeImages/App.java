package gr.atc.training.changeImages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class App 
{
    public static void main( String[] args )
    {
    	ImageHandling handler = new ImageHandling();
    	BufferedImage img = null;
    	try {
			img = ImageIO.read(new File("./dog.jpg"));
			// BufferedImage img = new BufferedImage (getClass().getResource("./dog.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	// For 735x490
    	BufferedImage resized_image = handler.resizeImage(img, 735, 490);
    	handler.saveImage(resized_image, "resized_dog_735_490.jpg");
    	
    	// For 490x327
    	resized_image = handler.resizeImage(img, 490, 327);
    	handler.saveImage(resized_image, "resized_dog_490_327.jpg");
    	
    	// For black and white
    	BufferedImage black_white_image = handler.blackWhiteImage(img);
    	handler.saveImage(black_white_image, "blackWhite_dog.jpg");
    }
}
