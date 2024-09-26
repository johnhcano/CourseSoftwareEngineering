public class EjecutarBuilderPattern {
    public static void main(String[] args) {
        
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        Reader objReader1 = new Reader("LINE", objC1);
        Reader objReader2 = new Reader("LINE", objC2);
        Reader objReader3 = new Reader("TABLE", objC3);

        objReader1.parseInput(objReader1.getElement());
        objReader2.parseInput(objReader2.getElement());
        objReader3.parseInput(objReader3.getElement());

    }
}