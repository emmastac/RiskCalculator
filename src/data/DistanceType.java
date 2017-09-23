package data;

public class DistanceType extends AbstractData {
	
	public DistanceType( String label ) {

		super( label );
	}

	public static enum Option {
		NATIONAL("national"), INTERNATIONAL("international");

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
