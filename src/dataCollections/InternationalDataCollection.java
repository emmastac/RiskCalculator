package dataCollections;

import java.util.Arrays;

import data.AbstractData;
import data.Country;
import data.DistanceType;


public class InternationalDataCollection extends BasicDataCollection{
	
	private Country fromCountry;
	private Country toCountry;
	

	private static final DistanceType.Option distanceType  = DistanceType.Option.INTERNATIONAL;
	
	public InternationalDataCollection(){
		super();
		fromCountry = new Country("from country");
		toCountry = new Country("to country");
	}
	
	public AbstractData[] getDataList(){
		AbstractData[] data = super.getDataList( );
		AbstractData[] dataList = Arrays.copyOfRange(data, 0, data.length+2);
		dataList[data.length] = fromCountry;
		dataList[data.length+1] = toCountry;
		return dataList;
	}
	
	@Override
	public DistanceType.Option getDistanceType( ) {

		return distanceType;
		
	}
	
	
	public Country getFromCountry( ) {
	
		return fromCountry;
	}
	
	public void setFromCountry( Country fromCountry ) {
	
		this.fromCountry = fromCountry;
	}
	
	public Country getToCountry( ) {
	
		return toCountry;
	}
	
	public void setToCountry( Country toCountry ) {
	
		this.toCountry = toCountry;
	}
	
	
	
}
