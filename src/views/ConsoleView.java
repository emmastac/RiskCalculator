package views;

import java.util.Scanner;

import data.AbstractData;

public class ConsoleView implements InterfaceView {
	
	private Scanner scanner;


	public ConsoleView() {
		scanner = new Scanner( System.in );
	}


	private void askForData( AbstractData data ) {

		System.out.println( "Please choose a " + data.getLabel() );
		int i = 0;
		for ( Object opt : data.getOptions( ) ) {
			System.out.println( "[" + ( i++ ) + "] " + opt.toString( ) );
		}
	}


	private void wrongValueGiven( AbstractData data ) {
		System.out.println( "Wrong data was given for " + data.getLabel( ) );
		collectData( data );
	}

	private void correctDataGiven( AbstractData data, Object option ) {
		System.out.println( option+ " was selected for "+ data.getLabel( ) );
		return;
	}


	private void parseGivenValue( AbstractData data) {

		String selected = scanner.nextLine( ).trim( );
		int optionsNum = data.getOptions( ).length;
		
		if ( optionsNum > 0 ) {
			int selectedOption = -1;
			try {
				selectedOption = Integer.valueOf( selected );
			} catch ( Exception e ) {
				
			}
			if ( selectedOption < 0 || selectedOption >= optionsNum ) {
				wrongValueGiven( data );
				return;
			} 
			correctDataGiven( data , data.getOptions( )[selectedOption] );
			data.setValue( data.getOptions( )[selectedOption] );
		}else{
			if( data.validateValue( selected )){
				correctDataGiven( data , selected);
			}else{
				wrongValueGiven( data );
				return;
			}
			data.setValue( selected );
		}
		

	}
	
	private void collectData(AbstractData data){
		askForData(data );
		parseGivenValue(  data );
	}

	public void collectDataThroughView( AbstractData[] dataList ) {
		for(AbstractData data : dataList){
			collectData(data);
		}
		
	}


	public void presentOutput( double result ) {

		System.out.println("Risk was calculated to : "+result);
		
	}
}
