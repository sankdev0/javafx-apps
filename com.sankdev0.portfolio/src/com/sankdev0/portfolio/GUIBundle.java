package com.sankdev0.portfolio;

import java.util.ListResourceBundle;

//default (English language, United States)
public class GUIBundle extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
				// LOCALIZE THIS
				{ "appTitle", "Student works portfolio tracking" }, { "editWindowTitle", "Edit item" },
				{ "okKey", "OK" }, { "cancelKey", "Cancel" }
				// END OF MATERIAL TO LOCALIZE
		};
	}
}
