package data;


public class DecimalData extends AbstractData {


	public DecimalData(String label){
		super(label);
	}
	
	public boolean validateValue(Object value){
		try{
			Double.valueOf( (String) value );
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public void setValue(Object object){
		this.value = Double.valueOf( ( String ) object );
	}
	

}
