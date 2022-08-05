import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        String texto = Arquivo.Reader("C:\\Users\\tiagu\\Documents\\Arquivo.txt");
        JOptionPane.showMessageDialog(null, texto);
        Arquivo.Writer("C:\\Users\\tiagu\\Documents\\Arquivo.txt", "Hello World");
        JOptionPane.showMessageDialog(null, Arquivo.Reader("C:\\Users\\tiagu\\Documents\\Arquivo.txt"));
    }
}
