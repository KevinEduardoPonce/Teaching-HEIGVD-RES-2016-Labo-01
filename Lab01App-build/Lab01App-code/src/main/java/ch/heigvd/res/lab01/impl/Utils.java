package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
      String[] lineFile = new String[2];
      int location = lines.indexOf('\n');
      //location = -1 if there is no \n founded
      if(location == -1)
      {
          //Look for \r if it is MAC os
          location = lines.indexOf('\r');
      }
      /*[0] write the line
        [1] write the end of the string*/
      lineFile[0] = lines.substring(0,location+1);
      lineFile[1] = lines.substring(location+1);
      return lineFile;
  }

}
