import javax.swing.JFrame;

public class Start {
	public static void main (String args[]){
		Reader r = new Reader("Main");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
