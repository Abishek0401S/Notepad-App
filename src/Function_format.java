import java.awt.Font;


public class Function_format {
	Notepad gui;
	Font arial,timesnewroman,comicsansms;
	String selectfont;
	public Function_format(Notepad gui){
		this.gui = gui;
	}
	
	public void wordwrap(){
		if(gui.wordwrapon == false){
			gui.wordwrapon = true;
			gui.textarea.setLineWrap(true);
			gui.textarea.setWrapStyleWord(true);
			gui.iwrap.setText("wordwrap : on");
		}else if(gui.wordwrapon == true){
			gui.wordwrapon = false;
			gui.textarea.setLineWrap(false);
			gui.textarea.setWrapStyleWord(false);
			gui.iwrap.setText("wordwrap : off");
		}
	}
	
	public void creatfont(int fontsize){
		arial = new Font("Arial",Font.PLAIN,fontsize);
		timesnewroman = new Font("Times New Roman",Font.PLAIN,fontsize);
		comicsansms = new Font("Comic sans ms",Font.PLAIN,fontsize);
		
		setFont(selectfont);
	}
	
	public void setFont(String font){
		selectfont = font;
		
		switch(selectfont){
		case "Arial": gui.textarea.setFont(arial);
		    break;
		case "Times New Roman": gui.textarea.setFont(timesnewroman);
		    break;
		case "Comic sans ms": gui.textarea.setFont(comicsansms);
		    break;
		}
	}
}
