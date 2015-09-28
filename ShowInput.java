import javax.swing.JOptionPane;

public class ShowInput {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an string", "Input Dialog Demo", JOptionPane.QUESTION_MESSAGE);

		JOptionPane.showMessageDialog(null, input);

		String doubleTypeString = JOptionPane.showInputDialog("Enter double");

		double d = Double.parseDouble(doubleTypeString);

		System.out.println(d);

		String intTypeString = JOptionPane.showInputDialog("Enter inter");

		int i = Integer.parseInt(intTypeString);

		System.out.println(i);
	}
}
