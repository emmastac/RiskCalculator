package data;


public class StringData extends AbstractData {


	public StringData(String label){
		super(label);
	}

	public boolean validateValue(Object value){
		return true;
	}
	
	public void setValue(Object value){
		this.value = value.toString( );
	}

}
