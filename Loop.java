import javax.swing.JOptionPane;

public class Loop {

	public static void main(String[] args){
		
		String areaString = JOptionPane.showInputDialog("Enter lenght:  ");
		double lenght = Double.parseDouble(areaString);
		
		String perimeterString = JOptionPane.showInputDialog("Enter width:  ");	
		double width = Double.parseDouble(perimeterString);

		double area, perimeter;

		area = lenght * width;
		perimeter = 2 * (lenght + width);

	
		JOptionPane.showMessageDialog(null, "The Area of the Rectangle is \"" + area + "\""
					+ "\n" + "The perimeter of the Rectangle is \"" + perimeter + "\"");


		System.exit(0);
		
		}

}