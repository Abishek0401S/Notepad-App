
public class Function_Edit {
	Notepad gui;
	public Function_Edit(Notepad gui){
		this.gui = gui;
	}
	
	public void undo(){
		gui.um.undo();
	}
	
	public void redo(){
		gui.um.redo();
	}
}
