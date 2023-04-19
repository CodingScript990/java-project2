module com.likelion.project2 {
		requires javafx.controls;
		requires javafx.fxml;


		opens com.likelion.project2 to javafx.fxml;
		exports com.likelion.project2;
}