module xyz.trebellar.tareadi02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens xyz.trebellar.tareadi02 to javafx.fxml;
    exports xyz.trebellar.tareadi02;
}
