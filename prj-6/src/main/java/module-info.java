module org.example.jpms.hellofx {
    requires javafx.controls;
    opens org.example.jpms.hellofx to javafx.graphics;
}
