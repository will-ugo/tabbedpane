import javax.swing.JFrame;

public class tabbedMain {
	public static void main (String args []) {
		tabbedPane tb = new tabbedPane();
		tb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tb.setSize(380, 300);
		tb.setVisible(true);
	}
}
