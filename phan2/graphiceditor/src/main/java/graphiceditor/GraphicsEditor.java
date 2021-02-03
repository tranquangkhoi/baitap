/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphiceditor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tranquangkhoi
 */
public class GraphicsEditor {
  public IFile file;
  public GraphicsEditor(IFile file) {
      this.file = file;
  }
  
  public void openFile(String fileName) throws Exception{
    file.openFile(fileName);
  }
  
  public void parseFile() throws Exception{
    file.parseFile();
  }
  
  public void saveFile() throws Exception{
    file.saveFile();
  }
}
