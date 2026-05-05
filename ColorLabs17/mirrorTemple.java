
/**
 * Write a description of class mirrorTemple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mirrorTemple
{
    // instance variables - replace the example below with your own
    private int x;
    
   public mirrorTemple()
   {
       
   }
   public static void main()
   {
       Picture temple = new Picture("images/temple.jpg");
       mirrorVertical(temple);
     
       temple.explore();
   }
   
    
     
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
      for (int y = 0; y < 159; y++)
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
 
  /**
   * copy one pic to another pic/canvas
   * add two ints to the params to place you want picture on the target
   */
  public static void copyToCanvas(Picture source, Picture target)
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
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
}
