package data;


public class IntegerData extends AbstractData {


	public IntegerData(String label){
		super(label);
	}
	
	public boolean validateValue(Object value){
		try{
			Integer.valueOf( (String) value );
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public void setValue(Object object){
		this.value = Integer.valueOf( ( String ) object );
	}
}
