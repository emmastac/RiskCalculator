package models;


public class AirDeclaration extends Declaration{
	
	public static final double  WEIGHT_FACTOR = 0.2;

	@Override
	protected double calculateRisk( ) {

		double grossWeight =  ((Double) this.dataCollection.getNetWeight( ).getValue());
		
		return WEIGHT_FACTOR * grossWeight;
	}
	
	
	


}
