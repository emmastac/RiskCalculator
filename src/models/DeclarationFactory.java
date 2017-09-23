package models;

import views.InterfaceView;
import views.ConsoleView;
import views.GUIView;
import views.ViewType;
import data.AbstractData;
import data.DistanceType;
import data.TransportType;

public class DeclarationFactory {

	private static final ViewType DEFAULT_VIEW = ViewType.CONSOLE;

	private static InterfaceView view;
	private static Declaration declaration;
	private static DistanceType distanceType;
	private static TransportType transportType;


	public DeclarationFactory( String selectedView ) {
		String preSelected = "CONSOLE";
		ViewType viewType = ViewType.valueOf( preSelected);
		view = getView( viewType );
		createDeclaration( );
		requestDeclarationData( );
		calculateDeclarationRisk( );

	}

	private static void calculateDeclarationRisk(){
		double risk = declaration.calculateRisk( );
		view.presentOutput(risk);
	}

	private static InterfaceView getView( ViewType selectedView ) {

		switch ( selectedView ) {
		case GUI :
			return new GUIView( );
		case CONSOLE :
			return new ConsoleView( ); 
		default :
			return getView( DEFAULT_VIEW ); 
		}
	}


	private static void createDeclaration( ) {
		transportType = new TransportType("transport type");
		distanceType = new DistanceType("distance type");
		AbstractData [ ] data = new AbstractData [ 2 ];
		data[ 0 ] = transportType;
		data[ 1 ] = distanceType;
		view.collectDataThroughView( data );
		declaration = Declaration.create( transportType , distanceType );
	}


	private static void requestDeclarationData( ) {
		view.collectDataThroughView( declaration.getDataCollection( ).getDataList( ) );

	}
}
