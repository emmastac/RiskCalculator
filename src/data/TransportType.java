package data;




public class TransportType extends AbstractData {
	
	
	public TransportType( String label ) {

		super( label );
			}

	public static enum Option {
		SEA("sea"), LAND("land"), AIR("air");

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
