package data;


public class Country extends AbstractData{
	
	
	public Country( String label ) {

		super( label );
	}

	@Override
	public void setValue( Object value ) {
		
	}

	public static enum Option {
	
		 USA("USA"), AUSTRALIA("Australia"), GREECE("Greece"), SOUTH_AFRICA("South Africa");
	
			Option( String label ) {
				this.label = label;
			}
			String label;
			public String toString(){
				return this.label;
			}
	 }

	@Override
	public Object[] getOptions( ) {

		return Option.values( );
	}

	@Override
	public boolean validateValue( Object value ) {

		return true;
	}
	 
	 
	 

}
