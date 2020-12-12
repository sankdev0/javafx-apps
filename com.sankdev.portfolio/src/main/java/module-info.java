module com.sankdev.portfolio {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens com.sankdev.portfolio to javafx.graphics, javafx.fxml;
}