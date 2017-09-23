package views;

import java.util.Arrays;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import data.AbstractData;

public class ApplicationWindow extends Application {

	private static BorderPane componentLayout;
	private static AbstractData[] data;
	
	public ApplicationWindow(){
		
	}
	
	public static void presentData(AbstractData[] absData){
		data = Arrays.copyOf( absData,  absData.length );
	}


	@Override
	public void start( Stage primaryStage ) {

		primaryStage.setTitle( "Risk Calculator" );

		componentLayout = new BorderPane( );
		componentLayout.setPadding( new Insets( 25) );
		// //
		FlowPane center = createCenterPane( );

		componentLayout.setCenter( center );

		// The button uses an inner class to handle the button click event
		Button submit = new Button( "Submit" );
		submit.setOnAction( arg0 -> {

			//declaration
		} );

		componentLayout.setBottom( submit );

		// Add the BorderPane to the Scene
		Scene appScene = new Scene( componentLayout , 500 , 500 );

		// Add the Scene to the Stage
		primaryStage.setScene( appScene );
		primaryStage.show( );
	}
	


	private FlowPane createCenterPane(  ) {

		final FlowPane centerPane = new FlowPane( );
		centerPane.setHgap( 100 );

		for ( AbstractData adata : data ) {
			FlowPane pane ;
			if ( adata.getOptions( ).length > 0 ) {
				 pane = createChoicePane( adata );
			}else{
				 pane = createInputPane( adata);
			}
			centerPane.getChildren( ).add( pane );
		}

		return centerPane;

	}


	private FlowPane createChoicePane( AbstractData data ) {

		final FlowPane choicePane = new FlowPane( );
		choicePane.setHgap( 120 );
		Label label = new Label( data.getLabel( ) );

		ChoiceBox options = new ChoiceBox( FXCollections.observableArrayList( Arrays.asList( data.getOptions( ) ) ) );

		choicePane.getChildren( ).add( label );
		choicePane.getChildren( ).add( options );

		return choicePane;
	}
	
	private FlowPane createInputPane( AbstractData data ) {

		final FlowPane choicePane = new FlowPane( );
		choicePane.setHgap( 120 );
		Label label = new Label( data.getLabel( ) );

		TextField textField = new TextField ();
		choicePane.getChildren( ).add( label );
		choicePane.getChildren( ).add( textField );

		return choicePane;
	}
}