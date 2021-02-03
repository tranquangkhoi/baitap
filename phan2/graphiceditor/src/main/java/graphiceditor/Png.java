/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphiceditor;

/**
 *
 * @author tranquangkhoi
 */
public class Png implements IFile {
  public static final String EXTENSION = "png";
  private String fileOpenned;

  public void openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  open " + fileName);
  }

  public void parseFile() {
    System.out.println(EXTENSION + ": parse");
  }

  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }
  }
}
