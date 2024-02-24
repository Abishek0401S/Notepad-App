import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class Function_File {
	Notepad gui;
	String fileName;
	String fileAddress;
	public Function_File(Notepad gui){
		this.gui = gui;
	}
	public void newFile(){
		gui.textarea.setText("");
		gui.jf.setTitle("New");
		fileName = null;
		fileAddress = null;
	}
	
	public void open(){
		FileDialog fd = new FileDialog(gui.jf, "Open", FileDialog.LOAD);
		fd.setVisible(true);
		
		if(fd.getFile()!= null){
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.jf.setTitle(fileName);
		}
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
			gui.textarea.setText("");
			String line = null;
			while((line = br.readLine())!= null){
				gui.textarea.append(line + "\n");
			}
			br.close();
		}catch(Exception e){
			System.out.println("File not Opened!");
		}
	}
	
	public void save(){
		if(fileName == null){
			saveas();
		}else{
			try{
				FileWriter fw = new FileWriter(fileAddress+fileName);
				fw.write(gui.textarea.getText());
				fw.close();
				
			}catch(Exception e){
				System.out.println("Somthing wrong");
			}
		}
		
	}
	public void saveas(){
		FileDialog fd = new FileDialog(gui.jf,"Save",FileDialog.SAVE);
		fd.setVisible(true);
		
		if(fd.getFile()!=null){
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();
			gui.jf.setTitle(fileName);
		}
		
		try{
			FileWriter fw = new FileWriter(fileAddress+fileName);
			fw.write(gui.textarea.getText());
			fw.close();
			
		}catch(Exception e){
			System.out.println("Something worng");
		}
	}
	
	public void exit(){
		System.exit(0);
	}
}
