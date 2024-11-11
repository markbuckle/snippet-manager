module org.csm.codesnippetmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.csm.codesnippetmanager to javafx.fxml;
    exports org.csm.codesnippetmanager;
}