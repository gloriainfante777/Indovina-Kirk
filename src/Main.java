import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Indovina Kirk");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setResizable(false);

        GamePanel pannello = new GamePanel();
        frame.add(pannello);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}