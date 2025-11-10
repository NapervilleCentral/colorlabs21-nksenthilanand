
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;//imports color class
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //KNOW IT FOR THE TEST!!!!!
     //relative path
     /*
      
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     //apic.explore(); //DISPLAY PIC
     //ferris1.explore();
     //moto.explore()
     /**/
     Picture snow = new Picture("images\\snowman.jpg");
     Picture snow1 = new Picture("images\\snowman.jpg");
     Picture snow2 = new Picture("images\\snowman.jpg");
     Picture snow3 = new Picture("images\\snowman.jpg");
     Picture snow4 = new Picture("images\\snowman.jpg");
     snow.explore();
     //changes color
     Pixel[] Spixels;
     Spixels = snow1.getPixels();
     int red, blue, green;
     for (Pixel spot1: Spixels)
     {
         red = spot1.getRed();
         red = (int)(red * 2);
         spot1.setRed(red);
         
         blue = spot1.getBlue();
         blue = (int)(blue * 2);
         spot1.setBlue(blue);
         
         green = spot1.getGreen();
         green = (int)(green * 2);
         spot1.setGreen(green);
     }
     snow1.explore();
         
     //makes it the opposite color, negates it
     Spixels = snow2.getPixels();
     for (Pixel spot1: Spixels)
     {
         red = spot1.getRed();
         red = (int)(255 - red);
         spot1.setRed(red);
         
         blue = spot1.getBlue();
         blue = (int)(255- blue);
         spot1.setBlue(blue);
         
         green = spot1.getGreen();
         green = (int)(255 - green);
         spot1.setGreen(green);
     }
     snow2.explore();
     // makes it grayscale
     Spixels = snow3.getPixels();
     int avg;
     for (Pixel spot1: Spixels)
     {
         red = spot1.getRed();
         red = (int)(red * Math.random());
         
         blue = spot1.getBlue();
         blue = (int)(blue * Math.random());
         
         green = spot1.getGreen();
         green = (int)(green * Math.random());
         
         avg = (red+blue+green) / 3;
         
         spot1.setRed(avg);
         spot1.setBlue(avg);
         spot1.setGreen(avg);

     }
     snow3.explore();
     
     
     
     //to change color of pic get all the pixels
     //makes an array of pixels
     //Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     //need to repeat for every picture
     //pixels = ferris1.getPixels();
     
     
     //Pixel[] Mpixels;
    // Mpixels = moto.getPixels();
     //how many pixels or how large array
    //System.out.println("This is a large array "+pixels.length  );


    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel 
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(423,282);
    Pixel ferr17 = pixels[17];
    
    ferr17.setRed(240);
    ferr17.setGreen(160);
    ferr17.setBlue(200);
    
    Color newColor = new Color (255, 99, 71); //makes new color
    spot2.setColor(Color.blue);
    spot.setColor(newColor);
    
    
    
    ferris1.explore();
    
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    for (int i = 0; i<10000; i++)
    {
        Pixel yuck = ferris1.getPixel((int)(Math.random()*500),(int)(Math.random()*500));
        yuck.setColor(Color.green);
    }
    ferris1.explore();
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    int red;
    for (Pixel spot1 : Mpixels)
    {
        //System.out.println( spot1 );
        red = spot1.getRed();
        
        red = (int)(red * .25);
    
        spot1.setRed(red);
    }
    moto.explore();

    int blue, green;
    for (Pixel spot1: Mpixels)
    {
        blue = spot1.getBlue();
        blue = (int)(blue * Math.random());
        
        green = spot1.getGreen();
        green = (int)(green * Math.random());
        
        spot1.setBlue(blue);
        spot1.setGreen(green);
    }
    moto.explore();
   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    //ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
