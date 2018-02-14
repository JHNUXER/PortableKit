package john;

import java.io.*;

import john.filesystem.*;

public class Bin {
  private static String path = "C:\\bin";
  
  public static void setup() {
    try {
      File file = new File(path);
      file.mkdirs();
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }

  public static String PATH(String input) {
    return new JPath(path+"/"+input).toString();
  }
}
