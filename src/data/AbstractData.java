package data;



public abstract class AbstractData {


	private String label;
	protected Object value;
	
	public AbstractData(String label){
		this.label = label;
	}
	
	public Object getValue(){
		return value;
	}
	
	public void setValue(Object object){
		this.value = object;
	}
	
	
	public abstract boolean validateValue(Object value);

	public String getLabel( ) {

		return label;
	}

	

	public Object[] getOptions( ) {

		return new Object[0];
	}
}
