import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[] args) {
		String Today = "11/14/17";
		String Birthday = JOptionPane.showInputDialog("when is your birthday");
		if (Today.equals(Birthday)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday");
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}

	}
}
