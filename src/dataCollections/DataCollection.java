package dataCollections;

import data.AbstractData;
import data.DistanceType;

public interface DataCollection {
	
	
	public abstract AbstractData[] getDataList();
	public abstract DistanceType.Option getDistanceType();

	

}
