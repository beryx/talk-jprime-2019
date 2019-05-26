module org.example.jpms {
    requires java.xml.bind;
    opens org.example.jpms to java.xml.bind;
}
