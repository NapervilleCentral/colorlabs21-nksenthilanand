
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
         Picture og = new Picture("images/sunset.jpg");
         Picture me = new Picture("images/sunset.jpg");
         Picture me1 = new Picture("images/sunset.jpg");
         Picture me2 = new Picture("images/sunset.jpg");
         og.explore();
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
        //me.write("images/newSunset.jpg"); 
        //me.explore();
         
         
         /**
          * method 2 change
          */
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
         //me1.explore();
         //me1.write("images/newSunset1.jpg");
         /**
          * custom color palette
          * change it to a orange/red
          */
         /*
         Try 1: 
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
        //me2.explore();
        ///me2.write("images/STtry1.jpg");
        //Jayanti Comment:
        //said to change min and max because my pic has very dark colors
        //my face too dark
        //try to divide by 5
        /**/
       //Try 2:
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
         for(Pixel spot1: pixel)
         {
             red = spot1.getRed();
             range = (big - small) / 5;
             if (red <= range)
                 spot1.setColor(new Color (248, 92, 126));
             else if (red > range && red <=range*2)
              spot1.setColor(new Color (238, 32, 76));
             else if (red > range*2 && red <=range*3)
             spot1.setColor(new Color(202, 123, 168));
             else if(red>range*3 && red<= range*4)
             spot1.setColor(new Color(253, 142 , 176));
             else
             spot1.setColor(new Color(237, 170, 190));
         }
       System.out.println(range);
       //range 51, 102, 163, 214, 265
         me2.explore();
         //Hayes comment, 
       
    }//main       
}//class
