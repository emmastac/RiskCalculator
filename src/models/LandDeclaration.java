package models;


public class LandDeclaration extends Declaration{
	
	public static final double  WEIGHT_FACTOR = 0.7;

	@Override
	protected double calculateRisk( ) {

		double grossWeight =  (Double) this.dataCollection.getNetWeight( ).getValue();
		
		return WEIGHT_FACTOR * grossWeight;
	}
	
	
	

}
