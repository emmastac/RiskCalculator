package data;

public class CargoType extends AbstractData {
	

	public CargoType( String label ) {

		super( label );
	}
	


	static enum Option {

		CLOTHING("clothing"), PHARMACEUTICALS("pharmaceuticals"), FOOD("food"), LIQUIDS("liquids");

		Option( String label ) {
			this.label = label;
		}
		String label;
		public String toString(){
			return this.label;
		}
	}


	@Override
	public Object [ ] getOptions( ) {

		return Option.values( );
	}


	@Override
	public boolean validateValue( Object value ) {

		return true;
	}

}
