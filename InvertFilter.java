import java.awt.Color;  
/**
 * An image filter to invert the colors of a picture.
 * 
 * 
 * 
 */ 
public class InvertFilter extends Filter  
{  
 public InvertFilter(String invertfilter)  
 {  
 	super(invertfilter);  
 }  
   
 public void apply(OFImage image)  
 {  
 	int height = image.getHeight();  
    int width = image.getWidth();  
         for(int x = 0; x < height; x++)  
 	{  
             for(int y = 0; y < width; y++)  
 		{  
                 Color pixel = image.getPixel(x, y);  
                 int r = 255 - pixel.getRed();  
                 int g = 255 - pixel.getGreen();  
                 int b = 255 - pixel.getBlue();  
                 image.setPixel(x, y, new Color(r, g, b));  
             }  
         }  
 	}  
 }  
