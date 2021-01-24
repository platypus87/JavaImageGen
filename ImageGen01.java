import java.awt.image.*;
import java.awt.Color;
import java.io.*;
import javax.imageio.*;

public class ImageGen01 {

	public static void main(String[] args) throws IOException {
		String fileOut= args[0];
		
		final int SIDE = 512;
		final int TYPE = BufferedImage.TYPE_INT_RGB;
		BufferedImage image = new BufferedImage(SIDE,SIDE,TYPE);
		
		final int LIMIT= 255;
		int c;
		
		Color color;
		
		for(int i=0; i<SIDE; i++) {
			for(int j=0; j<SIDE; j++) {
				c = (i*j/2)%LIMIT;
				color = new Color (c,c,c);
				image.setRGB(i, j, color.getRGB());
			}
			File outputFile = new File(fileOut);
			ImageIO.write(image,  "jpg", outputFile);
		}

	}

}
