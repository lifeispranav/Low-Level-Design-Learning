package SolidPrinciples.Example03.BetterCode;

public class Main {
    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor("/Users/pranav/Developer/System Design/LowLevelDesign/input.txt");
        TextProcessor TestProcessor = new TextProcessor(fp);
        TestProcessor.textConverter();
        
    }
}
