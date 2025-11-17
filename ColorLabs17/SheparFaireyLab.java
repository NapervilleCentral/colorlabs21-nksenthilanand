
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
         Picture me = new Picture("images/hoco.jpg");
         Picture me1 = new Picture("images/hoco.jpg");
         Picture me2 = new Picture("images/hoco.jpg");
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
        me.write("images/newHoco.jpg"); 
        me.explore();
         
         
         /**
          * method 2 change
          */
         /*
         pixel = me1.getPixels();
          int prev =0 , big =0 , small=0;
         for (Pixel spot1: pixel)
         {
             red = spot1.getRed();
             blue = spot1.getBlue();
             green = spot1.getGreen();
             avg = (red + blue + green ) / 3;
             
             if (avg > prev && avg > big )
             big = avg;
             else if (avg < small)
             small = avg;
         }
         int range = 0;
         for (Pixel spot1: pixel)
         {
             range = (big - small) / 4;
             red = spot1.getRed();
             if (red <=range)
                 spot1.setColor(new Color (7, 15, 168));
             else if (red > range && red <=range*2)
              spot1.setColor(new Color (207, 23, 6));
             else if (red > range*2 && red <=range*3)
             spot1.setColor(new Color(32, 181, 245));
             else
             spot1.setColor(new Color(240, 243, 245));
         }
         me1.explore();
         me1.write("images/newHoco1.jpg");
         
         /**
          * custom color palette

          */
         /*
         //Try 1: 
         int prev = 0, big = 0, small = 0;
         pixel = me2.getPixels();
         for(Pixel spot1 : pixel)
         {
             red = spot1.getRed();
             green = spot1.getGreen();
             blue = spot1.getBlue();
             
             avg = (red + green + blue) / 3;
             if (avg > prev && avg > big )
             big = avg;
             else if (avg < small)
             small = avg;
         }
         int range = 0;
         for(Pixel spot1: pixel)
         {
             red = spot1.getRed();
             range = (big - small) / 4;
             if (red <= range)
                 spot1.setColor(new Color (62, 8, 8));
             else if (red > range && red <=range*2)
              spot1.setColor(new Color (71, 13, 13));
             else if (red > range*2 && red <=range*3)
             spot1.setColor(new Color(225, 123, 123));
             else
             spot1.setColor(new Color(225, 99, 99));
         }
        me2.explore();
        me2.write("images/STtry1.jpg");
       
    
       //Try 2:
        /**/  
         pixel = me2.getPixels();
         int prev =0 , big =0 , small=0;
         for (Pixel spot1: pixel)
         {
             red = spot1.getRed();
             blue = spot1.getBlue();
             green = spot1.getGreen();
             avg = (red + blue + green ) / 3;
             
             if (avg > prev && avg > big )
             big = avg;
             else if (avg < small)
             small = avg;
         }
         int range = 0;
         for (Pixel spot1: pixel)
         {
             range = (big - small) / 4;
             red = spot1.getRed();
             if (red <=range)
                 spot1.setColor(new Color (23, 12, 131));
             else if (red > range && red <=range*2)
              spot1.setColor(new Color (133, 0, 112));
             else if (red > range*2 && red <=range*3)
             spot1.setColor(new Color(200, 81, 181));
             else
             spot1.setColor(new Color(240, 243, 245));
         //me2.write("images/STtry2.jpg");
         
        }//main 
        me2.explore();
        me2.write("images/STtry2.jpg");
        /**/
}
}
//class
