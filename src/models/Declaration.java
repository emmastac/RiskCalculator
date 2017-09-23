package models;

import data.DistanceType;
import data.TransportType;
import dataCollections.DataCollection;
import dataCollections.BasicDataCollection;

public abstract class Declaration {
	
	protected BasicDataCollection dataCollection;

	
	public static Declaration create( TransportType transportType, DistanceType distanceType ){
		Declaration declaration;
		switch((TransportType.Option) transportType.getValue( )){
	
		case SEA:
			declaration = new SeaDeclaration(); 
			break;
		case AIR:
			declaration = new AirDeclaration(); 
			break;
		case LAND:
			declaration = new LandDeclaration();
			break; 
		default:
			return null; 
		}
		declaration.dataCollection = BasicDataCollection.create(distanceType);
		return declaration;
	}
	
	protected abstract double calculateRisk( ) ;

	public DataCollection getDataCollection( ) {

		return dataCollection;
	}



}