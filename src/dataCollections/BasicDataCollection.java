package dataCollections;

import data.AbstractData;
import data.CargoType;
import data.DistanceType;
import data.DecimalData;
import data.IntegerData;
import data.StringData;

public class BasicDataCollection implements DataCollection{

	protected StringData consignee;
	protected StringData consigner;
	protected IntegerData quantity;
	protected DecimalData grossWeight;
	protected DecimalData netWeight;
	protected CargoType cargoType;
	
	private static final DistanceType.Option  distanceType = DistanceType.Option.NATIONAL;
	
	public static BasicDataCollection create( DistanceType distanceType ) {

		BasicDataCollection dataCollection;
		switch ( (DistanceType.Option) distanceType.getValue( ) ) {

		case NATIONAL :
			dataCollection = new BasicDataCollection( );
			break;
		case INTERNATIONAL :
			dataCollection = new InternationalDataCollection( );
			break;
		default :
			return null;
		}
		
		return dataCollection;
	}

	public BasicDataCollection() {
		consignee = new StringData("consignee");
		consigner = new StringData("consigner");
		quantity = new IntegerData("quantity");
		grossWeight = new DecimalData("grossWeight");
		netWeight = new DecimalData("netWeight");
		cargoType = new CargoType("cargo type");
	}

	

	public AbstractData[] getDataList(){
		AbstractData[] dataList = new AbstractData[]{
				consignee, consigner, quantity, grossWeight, netWeight, cargoType};
		return dataList;
	}



	@Override
	public DistanceType.Option getDistanceType( ) {

		return distanceType;
		
	}



	
	public StringData getConsignee( ) {
	
		return consignee;
	}



	
	public void setConsignee( StringData consignee ) {
	
		this.consignee = consignee;
	}



	
	public StringData getConsigner( ) {
	
		return consigner;
	}



	
	public void setConsigner( StringData consigner ) {
	
		this.consigner = consigner;
	}



	
	public IntegerData getQuantity( ) {
	
		return quantity;
	}



	
	public void setQuantity( IntegerData quantity ) {
	
		this.quantity = quantity;
	}



	
	public DecimalData getGrossWeight( ) {
	
		return grossWeight;
	}



	
	public void setGrossWeight( DecimalData grossWeight ) {
	
		this.grossWeight = grossWeight;
	}



	
	public DecimalData getNetWeight( ) {
	
		return netWeight;
	}



	
	public void setNetWeight( DecimalData netWeight ) {
	
		this.netWeight = netWeight;
	}



	
	public CargoType getCargoType( ) {
	
		return cargoType;
	}



	
	public void setCargoType( CargoType cargoType ) {
	
		this.cargoType = cargoType;
	}


}
