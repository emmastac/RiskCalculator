package views;
import data.AbstractData;


public interface  InterfaceView {
	
	public abstract void collectDataThroughView(AbstractData [ ] dataList);
	public abstract void presentOutput(double data);

}
