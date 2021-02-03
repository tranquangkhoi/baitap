import graphiceditor.GraphicsEditor;
import graphiceditor.Jpg;

public class App {
    public static void main(String[] args) {
        GraphicsEditor graphicsEditor = new GraphicsEditor(new Jpg());
        try {
            graphicsEditor.openFile("test.BMP");
            graphicsEditor.parseFile();
            graphicsEditor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
