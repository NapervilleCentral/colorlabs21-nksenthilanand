
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         
         //relative path
         //Picture apic = new Picture("images\\beach.jpg");
         //change with selfie picture
         //Picture me = new Picture("images/beach.jpg");
         Picture me = new Picture("images/sunset.jpg");
         //Picture me2 = new Picture("images/sunset.jpg");
         
         /**
          * method 1 change
          */
         Pixel[] pixel;
         pixel = me.getPixels();
         int red = 0, blue, green, avg;
         for (Pixel spot1: pixel)
         {
             red = spot1.getRed();
             blue = spot1.getBlue();
             green = spot1.getGreen();
             avg = (red + blue + green ) / 3;
             spot1.setColor(new Color(avg,avg,avg));
             }
         
        for (Pixel spot1 : pixel)
        {
            red = spot1.getRed(); 
            if (red <=62)
                 spot1.setColor(new Color (7, 15, 168));
             else if (red > 63 && red <=127)
              spot1.setColor(new Color (207, 23, 6));
             else if (red > 127 && red <=190)
             spot1.setColor(new Color(32, 181, 245));
             else
             spot1.setColor(new Color(240, 243, 245));
        }
        //me.write("images/); 
        me.explore();
         
         
         /**
          * method 2 change
          */
          int prev =0 , big =0 , small=0;
         for (Pixel spot1: pixel)
         {
             red = spot1.getRed();
             blue = spot1.getBlue();
             green = spot1.getGreen();
             avg = (red + blue + green ) / 3;
             
             if (avg > big && avg > small)
             avg = big;
             else if (avg < small)
             avg = small;
         }
         int range = 0;
         for (Pixel spot1: pixel)
         {
             range = (big - small) / 4;
             red = spot1.getRed();
             if (red <= range)
                 spot1.setColor(new Color (7, 15, 168));
             else if (red > range && red <=range*2)
              spot1.setColor(new Color (207, 23, 6));
             else if (red > range*2 && red <=range*3)
             spot1.setColor(new Color(32, 181, 245));
             else
             spot1.setColor(new Color(240, 243, 245));
         }
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
