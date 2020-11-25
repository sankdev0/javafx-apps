module com.sankdev0.portfolio {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens com.sankdev0.portfolio to javafx.graphics, javafx.fxml;
}