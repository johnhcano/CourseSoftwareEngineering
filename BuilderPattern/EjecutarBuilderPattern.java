public class EjecutarBuilderPattern {
    public static void main(String[] args) {
        
        Conveter objC1 = new ASCIIConverter();
        Conveter objC2 = new PostScriptConverter();
        Conveter objC3 = new PDFConverter();

        Reader objReader = new Reader("LINE", objC1);

        objReader.parseInput(objReader.getElement());

    }
}