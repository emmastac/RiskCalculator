package controller;

import models.DeclarationFactory;

public class MainApp {

	public static void main( String [ ] args ) {
		if ( args.length > 0 ) {
			new DeclarationFactory( args[0] );
		}else{
			new DeclarationFactory("");
		}

	}
}
