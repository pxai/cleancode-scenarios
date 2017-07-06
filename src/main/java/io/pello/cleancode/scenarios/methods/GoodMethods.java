package io.pello.cleancode.scenarios.methods;

public class GoodMethods {
	public String printHTML(String content) {
		return "<html><head></head><body>" + content + "</body></html>";
	}

	public String printJSON(String content) {
		return "{ \"content\": \"" + content + "\"}";
	}

	public String printPlainText(String content) {
		return content;
	}

	public String printHTML5(String content) {
		return "<!DOCTYPE html>" + "<html><head></head><body>" + content + "</body></html>";
	}

	public String printHTML4(String content) {
		return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" " + "<html><head></head><body>" + content
				+ "</body></html>";
	}
	
	
	public void printContent (String content) throws Exception {
		if (isContentEmpty(content)) {
			throw new Exception("Invalid content");
		} else {
			System.out.println("<html><head></head><body>" + content + "</body></html>");
		}
	}

	private boolean isContentEmpty(String content) {
		return null == content || content.trim().equals("") || content.length() < 3;
	}
}
