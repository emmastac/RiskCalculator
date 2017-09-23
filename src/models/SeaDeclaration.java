package models;

import data.Country;
import data.DistanceType;
import dataCollections.InternationalDataCollection;

public class SeaDeclaration extends Declaration {

	@Override
	protected double calculateRisk( ) {

		DistanceType.Option distType = this.dataCollection.getDistanceType( );
		
		if ( distType.compareTo( DistanceType.Option.INTERNATIONAL ) == 0
				&& ( ( Country.Option ) ( ( InternationalDataCollection ) this.dataCollection ).getToCountry( ).getValue( ) )
						.compareTo( Country.Option.SOUTH_AFRICA ) == 0 ) {
			return ( (Double) this.dataCollection.getGrossWeight( ).getValue( ) ) * 0.87;
		} else {
			return ( (Double) this.dataCollection.getNetWeight( ).getValue( ) ) * 0.27;
		}
	}
}
