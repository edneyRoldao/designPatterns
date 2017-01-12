package cases.textEditor;

public class ExampleTest01 {
	
	public static void main(String[] args) {
		
		String text = "I just want to understand the concepts behind this pattern";
		
		TextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText(text);
		
		formatter = new LowerTextFormatter();
		editor = new TextEditor(formatter);
		editor.publishText(text);
		
	}

}
