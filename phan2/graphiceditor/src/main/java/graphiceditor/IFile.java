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
public interface IFile {
    void openFile(String fileName);
    void parseFile();
    void saveFile();
}
