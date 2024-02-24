import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;


public class Notepad implements ActionListener {
	
	JFrame jf;
	//text area
	JTextArea textarea;
	boolean wordwrapon = false;
	JScrollBar scrollbar;
	JScrollPane scrollpane;
	JMenuBar menubar;
	//top menu bar
	JMenu menufile, menuedit, menuformat,menucolor,menuhelp;
	// file menu 
	JMenuItem inew, iopen, isave, isaveas, iexit;
	//edit menu
	JMenuItem iUndo, iRedo;
	// format menu
	JMenuItem iwrap, ifontArial, ifontcsms, ifonttnr;
	JMenu menufont,menufontsize, ifontsize8, ifontsize12, ifontsize16, ifontsize20, ifontsize24, ifontsize28;
	//color menu
	JMenuItem icolor1,icolor2,icolor3;
	//help menu
	JMenuItem iviewHelp,isendFeeback,iaboutNotepad;
	
	Function_File file = new Function_File(this);
	Function_format format = new Function_format(this);
	Function_Color color = new Function_Color(this);
	Function_Edit edit = new Function_Edit(this);
	Function_Help help = new Function_Help(this);
	
	UndoManager um = new UndoManager();
	
	public static void main(String args[]){
		new Notepad();
	}
	
	public Notepad(){
		creatingWindow();
		creatingTextArea();
		creatingScrollPane();
		creatingMenuBar();
		creatFileMenu();
		creatingFormatMenu();
		format.selectfont = "Arial";
		format.creatfont(16);;
		format.wordwrap();
		color.Backgroundcolor("white");
		creatColorMenu();
		creatingEditMenu();
		creatingHelpMenu();
		jf.setVisible(true);
	}
	
	public void creatingWindow(){
		jf = new JFrame("Notepad");
		jf.setSize(800, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void creatingTextArea(){
		textarea = new JTextArea();
		jf.add(textarea);
		textarea.getDocument().addUndoableEditListener(
				new UndoableEditListener() {
					@Override
					public void undoableEditHappened(UndoableEditEvent e) {
						// TODO Auto-generated method stub
						um.addEdit(e.getEdit());
					}
				});
	}
	public void creatingScrollPane(){
		scrollpane = new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollpane.setBorder(BorderFactory.createEmptyBorder());
		jf.add(scrollpane);
	}
	public void creatingMenuBar(){
		menubar = new JMenuBar();
		jf.setJMenuBar(menubar);
	
		
		menufile = new JMenu("File");
		menubar.add(menufile);
		
		menuedit = new JMenu("Edit");
		menubar.add(menuedit);
		
		menuformat = new JMenu("Format");
		menubar.add(menuformat);
		
		menucolor = new JMenu("Color");
		menubar.add(menucolor);
		
		menuhelp = new JMenu("Help");
		menubar.add(menuhelp);
	}
	
	public void creatFileMenu(){
		inew = new JMenuItem("New");
		inew.addActionListener(this);
		inew.setActionCommand("New");
		menufile.add(inew);
		
		iopen = new JMenuItem("Open");
		iopen.addActionListener(this);
		iopen.setActionCommand("Open");
		menufile.add(iopen);
		
		isave = new JMenuItem("Save");
		isave.addActionListener(this);
		isave.setActionCommand("Save");
		menufile.add(isave);
		
		isaveas = new JMenuItem("Saveas");
		isaveas.addActionListener(this);
		isaveas.setActionCommand("Saveas");
		menufile.add(isaveas);
		
		iexit = new JMenuItem("Exit");
		iexit.addActionListener(this);
		iexit.setActionCommand("Exit");
		menufile.add(iexit);
	}
	
	public void creatingEditMenu(){
		iUndo = new JMenuItem("Undo");
		iUndo.addActionListener(this);
		iUndo.setActionCommand("Undo");
		menuedit.add(iUndo);
		
		iRedo = new JMenuItem("Redo");
		iRedo.addActionListener(this);
		iRedo.setActionCommand("Redo");
		menuedit.add(iRedo);
		
	}
	
	public void creatingFormatMenu(){
		iwrap = new JMenuItem("word wrap: off");
		iwrap.addActionListener(this);
		iwrap.setActionCommand("word wrap");
		menuformat.add(iwrap);
		
		menufont = new JMenu("Font");
		menuformat.add(menufont);
		
		ifontArial = new JMenuItem("Arial");
		ifontArial.addActionListener(this);
		ifontArial.setActionCommand("Arial");
		menufont.add(ifontArial);
		
		ifontcsms = new JMenuItem("Comic sans Ms");
		ifontcsms.addActionListener(this);
		ifontcsms.setActionCommand("Comic sans Ms");
		menufont.add(ifontcsms);
		
		ifonttnr = new JMenuItem("Times new romen");
		ifonttnr.addActionListener(this);
		ifonttnr.setActionCommand("Times new romen");
		menufont.add(ifonttnr);
		
		menufontsize = new JMenu("Font Size");
		menuformat.add(menufontsize);
		
		ifontsize8 = new JMenu("8");
		ifontsize8.addActionListener(this);
		ifontsize8.setActionCommand("size8");
		menufontsize.add(ifontsize8);
		
		ifontsize12 = new JMenu("12");
		ifontsize12.addActionListener(this);
		ifontsize12.setActionCommand("size12");
		menufontsize.add(ifontsize12);
		
		ifontsize16 = new JMenu("16");
		ifontsize16.addActionListener(this);
		ifontsize16.setActionCommand("size16");
		menufontsize.add(ifontsize16);
		
		ifontsize20 = new JMenu("20");
		ifontsize20.addActionListener(this);
		ifontsize20.setActionCommand("size20");
		menufontsize.add(ifontsize20);
		
		ifontsize24 = new JMenu("24");
		ifontsize24.addActionListener(this);
		ifontsize24.setActionCommand("size24");
		menufontsize.add(ifontsize24);
		
		ifontsize28 = new JMenu("28");
		ifontsize28.addActionListener(this);
		ifontsize28.setActionCommand("size28");
		menufontsize.add(ifontsize28);
		
		
	}
	
	public void creatColorMenu(){
		icolor1 = new JMenuItem("white");
		icolor1.addActionListener(this);
		icolor1.setActionCommand("white");
		menucolor.add(icolor1);
		
		icolor2 = new JMenuItem("black");
		icolor2.addActionListener(this);
		icolor2.setActionCommand("black");
		menucolor.add(icolor2);
		
		
		icolor3 = new JMenuItem("blue");
		icolor3.addActionListener(this);
		icolor3.setActionCommand("blue");
		menucolor.add(icolor3);
	}
	
	public void creatingHelpMenu(){
		iviewHelp = new JMenuItem("View Help");
		iviewHelp.addActionListener(this);
		iviewHelp.setActionCommand("View Help");
		menuhelp.add(iviewHelp);
		
		isendFeeback = new JMenuItem("Send Feedback");
		isendFeeback.addActionListener(this);
		isendFeeback.setActionCommand("Send Feedback");
		menuhelp.add(isendFeeback);
		
		iaboutNotepad = new JMenuItem("About Notepad");
		iaboutNotepad.addActionListener(this);
		iaboutNotepad.setActionCommand("About Notepad");
		menuhelp.add(iaboutNotepad);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		switch (command) {
		case "New": file.newFile();
			break;
		case "Open": file.open();
		    break;
		case "Save": file.save();
		    break;
		case "Saveas": file.saveas();
		    break;
		case "Exit": file.exit();
		    break;
		case "Undo": edit.undo();
		    break;
		case "Redo": edit.redo();
		    break;
		case "word wrap": format.wordwrap();
		    break;
		case "Arial": format.setFont(command);
		    break;
		case "Comic sans Ms": format.setFont(command);
		    break;
		case "Times new romen": format.setFont(command);
		    break;
		case "size8": format.creatfont(8);
		    break;
		case "size12": format.creatfont(12);
	        break;
		case "size16": format.creatfont(16);
	        break;
		case "size20": format.creatfont(20);
	        break;
		case "size24": format.creatfont(24);
            break;
		case "size28": format.creatfont(28);
            break;
		case "white": color.Backgroundcolor(command);
		    break;
		case "black": color.Backgroundcolor(command);
	        break;
		case "blue": color.Backgroundcolor(command);
	        break;
		case "View Help": 
			try {
				help.View_Help("View Help");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		    break;
		case "Send Feedback":
			try {
				help.View_Help("Send Feedback");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    break;
		case "About Notepad": 
			try {
				help.View_Help("About Notepad");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
	
}

  