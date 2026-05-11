/**
 * Test Picture Classes
 *
 * @author (Nithela)
 * @version (10-19-2016)
 */
import java.awt.*; // the color class is in the awt library
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class PosterMain
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture original = new Picture("images/mlp.jpg");
     int w = original.getWidth();
     int h = original.getHeight();
     Picture canvas = new Picture(w*3, w*2);
     copyToCanvas(original, canvas, 0, 0);
     
     //mirrors image
     Picture mod1 = new Picture(original);
     mirrorVertical(mod1);
     copyToCanvas(mod1, canvas, w, 0);
     
     //grayscale
     Picture mod2 = new Picture(original);
     grayscale(mod2);
    copyToCanvas(mod2, canvas, w * 2, 0);
     
    // recursive
    Picture mod3 = new Picture(original);
     recursive(mod3, 0, 0 ,w , h);
    copyToCanvas(mod3, canvas,0, h);
    
    //sepia
    Picture mod4 = new Picture(original);
    sepia(mod4);
    copyToCanvas(mod4, canvas, w, h);  
     
    //blend
    Picture mod5 = new Picture(original);
    blend(mod5, mod2);
    copyToCanvas(mod5, canvas, w * 2, h);
     //copyToCanvas(pCollage, acanvas);
     //ferris1.explore(); // displays the picture
     //moto.explore();
     canvas.explore();
     //A GIVEN - YOU HAVE TO DO THIS FOR EVERY IMAGE
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     //pixels = pCollage.getPixels();
    canvas.write("images/mlpCanvas.jpg");
  }//main
 
  /**
   * Method to mirror on a vertical line in the middle of the picture based on
   * the width
   */
 
  public static void mirrorVertical(Picture source)
  {
      int width = source.getWidth();
      int mirrorPoint = width / 2;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
     
      //loop through all the rows
      for (int y = 0; y < source.getHeight(); y++)
      {
          //loop from 0 to the middle (mirror Point)
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = source.getPixel(x, y);
              rightPixel = source.getPixel(width - 1 - x, y);
             
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }
  
  
  public static void grayscale(Picture source) {
    
    Pixel[] pixels;
     pixels = source.getPixels();
   
    for (Pixel o : pixels) {
        
        int red = o.getRed();
        int green = o.getGreen();
        int blue = o.getBlue();

        int average = (red + green + blue) / 3;

        o.setColor(new Color(average, average,average));
        //o.setGreen(average);
        //o.setBlue(average);
    }
}


public static void recursive(Picture source, int x, int y, int w, int h) {
    
    if (w < 20 || h < 20) 
        return;
    for (int col = 0; col < w; col++) {
        for (int row = 0; row < h; row++) {
            Pixel sourcePix = source.getPixel((int)(col * (source.getWidth() / (double)w)), 
                                           (int)(row * (source.getHeight() / (double)h)));
            source.getPixel(x + col, y + row).setColor(sourcePix.getColor());
        }
    }
    recursive(source, x + 10, y + 10, w / 2, h / 2);
}


public static void sepia(Picture source) {
      grayscale(source);
    Pixel[] pixels = source.getPixels();
    for (Pixel p : pixels) {
        int r = p.getRed();
        int g = p.getGreen();
        int b = p.getBlue();

        if (r < 60) {
            p.setRed((int)(r * 0.9));
        } else if (r < 190) {
            p.setBlue((int)(b * 0.8));
        } else {
            p.setBlue((int)(b * 0.7));
        }
    }
}

public static void blend(Picture source, Picture other) {
    for (int x = 0; x < source.getWidth(); x++) {
        for (int y = 0; y < source.getHeight(); y++) {
            Pixel p1 = source.getPixel(x, y);
            Pixel p2 = other.getPixel(x, y);
            
            int newR = (int)(p1.getRed() * 0.5 + p2.getRed() * 0.5);
            int newG = (int)(p1.getGreen() * 0.5 + p2.getGreen() * 0.5);
            int newB = (int)(p1.getBlue() * 0.5 + p2.getBlue() * 0.5);
            
            p1.setColor(new Color(newR, newG, newB));
        }
    }
}
  /**
   * copy one pic to another pic/canvas
   * add two ints to the params to place you want picture on the target
   */
  public static void copyToCanvas(Picture source, Picture target, int x, int y)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
     
      //loop through the columns (targetX is the starting point on the Canvas) sourceX += 2 - make smaller, copy every other pixel 
      for (int sourceX = 0, targetX = 0; sourceX < source.getWidth(); sourceX++, targetX++)
      {
          //loop through the rows
          for (int sourceY = 0, targetY = 0; sourceY < source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX + x, targetY + y);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
}//class