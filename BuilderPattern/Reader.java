public class Reader{

    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }

    public String getElement(){
        return element;
    }

    public Converter getConverter(){
        return converter;
    }

    public void parseInput(String element){
        switch(element){
            case "LINE":
                System.out.println(converter.makeLine());
                break;
            case "PARAGRAPH":
                System.out.println(converter.makeParagraph());
                break;
            case "TABLE":
                System.out.println(converter.makeTable());
                break;
            default:
                System.out.println("No se reconoce la conversion");
        }
    }
}