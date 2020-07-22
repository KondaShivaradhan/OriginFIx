import java.io.File;
import java.util.*;

public class FixO {

  public static void main(String[] args) {
    CloseO();
    Fixing();
  }

  public static void Fixing() {
    String sname = System.getProperty("user.name");
    File myF = new File("C://Users//" + sname + "//AppData//Local//Origin");
    File myF2 = new File("C://Users//" + sname + "//AppData//Roaming//Origin");
    DelFol(myF);
    DelFol(myF2);
    Runtime r = Runtime.getRuntime();
    System.out.println("opening Fixed Origin.....");
    try {
      r.exec("C://Program Files (x86)//Origin//Origin.exe");
      System.out.println("Origin Fixed");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void CloseO() {
    
    System.out.println("Fixing Origin");
    try {
      Runtime rt = Runtime.getRuntime();
      Process proc = rt.exec("taskkill /F /IM origin.exe");
      Process p = Runtime
        .getRuntime()
        .exec("taskkill /F /IM OriginWebHelperService.exe");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void DelFol(File file) {
    File[] contents = file.listFiles();
    if (contents != null) {
      for (File f : contents) {
        DelFol(f);
      }
    }
    file.delete();
    System.out.println("deleted " + file);
  }
}
