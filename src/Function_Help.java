import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.*;
public class Function_Help {
	Notepad gui;
	public Function_Help(Notepad gui){
		this.gui = gui;
	}
	
	public void View_Help(String Help) throws IOException{
		
		switch (Help) {
		case "View Help":
			final String targetUrl = "https://www.bing.com/search?q=get+help+with+notepad+in+windows&filters=guid:%224466414-en-dia%22%20lang:%22en%22&form=T00032&ocid=HelpPane-BingIA";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(targetUrl));
		    break;
		    
		case "Send Feedback":
			final String feedbackHubURL = "https://www.google.com/search?q=feedback+hub+&sca_esv=592436497&sxsrf=AM9HkKkp4wvhC08uZv3_kgwFfT4ATdE-Fg%3A1703056787810&ei=k5WCZfiGMYGZ4-EPj_qUWA&ved=0ahUKEwi4nPr2vJ2DAxWBzDgGHQ89BQsQ4dUDCBA&uact=5&oq=feedback+hub+&gs_lp=Egxnd3Mtd2l6LXNlcnAiDWZlZWRiYWNrIGh1YiAyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESOVyUKgJWOtucAJ4AZABAJgBvgagAbMwqgENMC4yLjIuMy4wLjIuNLgBA8gBAPgBAagCFMICBxAjGOoCGCfCAhYQLhgDGI8BGOUCGOoCGLQCGIwD2AEBwgIWEAAYAxiPARjlAhjqAhi0AhiMA9gBAcICEBAuGIAEGIoFGMcBGK8BGCfCAgQQIxgnwgIKECMYgAQYigUYJ8ICERAAGIAEGIoFGJECGLEDGIMBwgILEAAYgAQYigUYkQLCAhEQLhiABBixAxiDARjHARjRA8ICCBAAGIAEGLEDwgIOEAAYgAQYigUYsQMYgwHCAh0QLhiABBiKBRjHARivARiXBRjcBBjeBBjgBNgBAsICChAAGIAEGIoFGEPCAhYQLhiABBiKBRhDGLEDGIMBGMcBGNEDwgILEAAYgAQYsQMYgwHCAg0QABiABBiKBRhDGLEDwgIQEAAYgAQYigUYQxixAxiDAcICChAuGIAEGIoFGEPCAg0QLhiABBiKBRhDGLED4gMEGAAgQYgGAboGBggBEAEYC7oGBggCEAEYFA&sclient=gws-wiz-serp";
		    java.awt.Desktop.getDesktop().browse(java.net.URI.create(feedbackHubURL));
		 	break;
		 	
		case "About Notepad":
			final String aboutNotepad = "https://www.vedantu.com/computer-science/notepad";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(aboutNotepad));
			break;
		}
	}
}
