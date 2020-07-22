// Java program to demonstrate working of Robot
// class. This program is for Windoes. It opens
// notepad and types a message.
import java.awt.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.io.*;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class robo {

  public static void main(String[] args)
    throws IOException, AWTException, InterruptedException {
    String command = "C:/Program Files (x86)/Origin/origin.exe";
    // String command = "notepad.exe";
    Runtime run = Runtime.getRuntime();
    run.exec(command);
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Create an instance of Robot class
    Robot robot = new Robot();
    String acc = "Email HERE";
    StringSelection stringSelection = new StringSelection(acc);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, stringSelection);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(1000);
    String pass = "Pass HERE";
    StringSelection stringSelection2 = new StringSelection(pass);
    Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard2.setContents(stringSelection2, stringSelection2);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_ENTER);
    System.exit(0);
  }
}
