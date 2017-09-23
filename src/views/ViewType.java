package views;


public enum ViewType {
	
	CONSOLE("console"), GUI("gui");
	
	ViewType( String label ) {
		this.label = label;
	}
	
	String label;
	public String toString(){
		return this.label;
	}
	
	

}
