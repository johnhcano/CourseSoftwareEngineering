public class EjecutarBuilderPattern {
    public static void main(String[] args) {
        
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        Reader objReader = new Reader("LINE", objC1);

        objReader.parseInput(objReader.getElement());

    }
}