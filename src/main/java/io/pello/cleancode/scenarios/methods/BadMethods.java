package io.pello.cleancode.scenarios.methods;

public class BadMethods {

	public static final int ERROR_CONTENT_NULL = -1;
	public static final int ERROR_CONTENT_EMPTY = -2;
	private static final int ERROR_CONTENT_SHORT = -3;
	private static final int CONTENT_OK = 1;
	int deadVariable;
	
	public String print(String content) {
		String result = "";
		result += "<html><head></head><body>";
		result += content;
		result += "</body></html>";

		return result;
	}

	public String printFormat(String content, int format) {
		String result = "";

		switch (format) {
		case 0:
			result = "<html><head></head><body>" + content + "</body></html>";
			break;
		case 1:
			result = "{ \"content\": \"" + content + "\"}";
			break;
		default:
			result = content;
			break;
		}
		return result;
	}
	
	public String print(String content, boolean isHTML5) {
		String result;
		
		if (isHTML5) {
			result = "<!DOCTYPE html>"; 
		} else {
			result = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" ";
		}
		
		result += "<html><head>";
		result += "</head><body>";
		result += content;
		result += "</body></html>";

		return result;
	}

	// Error codes and classes with codes are DEPENDENCY MAGNETS
	public int printContent (String content) {
		if (null == content) {
			return ERROR_CONTENT_NULL;
		} else if (content.trim().equals("")) {
			return ERROR_CONTENT_EMPTY;
		} else if (content.length() < 3) {
			return ERROR_CONTENT_SHORT;
		} else {
			System.out.println("<html><head></head><body>" + content + "</body></html>");
		}
		return CONTENT_OK;
	}
}
