package john;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.util.*;

import john.filesystem.*;

public class Installer {
  public static final URL url_ojdkp_zip = new URL("https://drive.google.com/uc?export=download&id=0BwOlsjYTjwdZY24zVUxCODRoeTA");
  public static final URL url_atom_zip_win = new URL("https://github.com/atom/atom/releases/download/v1.25.0-beta0/atom-windows.zip");
  // public static final URL url_atom_zip_mac = new URL("https://github.com/atom/atom/releases/download/v1.25.0-beta0/atom-mac.zip");
  // public static final URL url_atom_zip_lnx = new URL("https://github.com/atom/atom/releases/download/v1.25.0-beta0/atom-amd64.tar.gz");

  public void install() {
    File temp = new File("C:\\John\\tmp");
    temp.mkdirs();
    Bin.setup();
    new ZipFile(Internet.download(url_ojdkp_zip,temp)).extract(new File());
  }
}
