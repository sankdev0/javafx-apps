package com.sankdev.portfolio;

import java.util.ListResourceBundle;

//default (English language, United States)
public class GUIBundle_en_US extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
				// LOCALIZE THIS
				{ "appTitle", "Student works portfolio tracking" }, { "editWindowTitle", "Edit item" },
				{ "okKey", "OK" }, { "cancelKey", "Cancel" }, {"editButton","Edit"}, { "deleteButton", "Delete" },
				{"addButton", "Create"}, {"saveButton", "Save"}, {"loadButton","Load"}
				// END OF MATERIAL TO LOCALIZE
		};
	}
}
