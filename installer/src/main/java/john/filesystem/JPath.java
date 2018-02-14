package john.filesystem;

import java.io.*;
import java.nio.*;
import java.util.*;

public class JPath extends ArrayList<String> {
  public JPath(String string) {
    for (Stirng s : string.replace("\\","/").split("/")) {
      if (s != "") add(s);
    }
  }
  public JPath(File file) {
    this(file.getAbsolutePath());
  }

  public File toFile() {
    return new File(this.toString());
  }

  public static String toString() {
    String s0 = "";
    char d = System.getProperty("os.name").toLowerCase().contains("windows")?'\\':'/';
    for (int i = 0; i < size; i++) {
      s0 += get(i);
      if (i < size) s0 += d;
    }
    return s0;
  }
}
