package views;

import javafx.application.Application;
import javafx.stage.Stage;
import data.AbstractData;


public class GUIView extends Application implements InterfaceView  {
	
	private static boolean viewStarted = false;
	

	@Override
	public void collectDataThroughView( AbstractData [ ] dataList ) {
		ApplicationWindow.presentData( dataList );
		if( viewStarted==false ){
			launch(ApplicationWindow.class);
		}
	}
	
	@Override
	public void presentOutput( double data ) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void start( Stage arg0 ) throws Exception {

		// TODO Auto-generated method stub
		
	}

}
