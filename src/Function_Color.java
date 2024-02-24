import java.awt.Color;



public class Function_Color {
	Notepad gui;
	public Function_Color(Notepad gui){
		this.gui = gui;
	}
	
	public void Backgroundcolor(String color){
		switch (color) {
		case "white":
			gui.jf.getContentPane().setBackground(Color.white);
			gui.textarea.setBackground(Color.white);
			gui.textarea.setForeground(Color.black);
			break;

		case "black":
			gui.jf.getContentPane().setBackground(Color.black);
			gui.textarea.setBackground(Color.black);
			gui.textarea.setForeground(Color.white);
			break;
			
		case "blue":
			gui.jf.getContentPane().setBackground(Color.blue);
			gui.textarea.setBackground(Color.blue);
			gui.textarea.setForeground(Color.white);
			break;
		}
	}
}
