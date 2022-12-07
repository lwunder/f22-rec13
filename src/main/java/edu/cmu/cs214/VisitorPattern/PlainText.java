package edu.cmu.cs214.VisitorPattern;

/**
 * class represent text method.
 */
public record PlainText(String text) implements DocumentPart {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
    // @Override
    // public String toHTML() {
    //     return text;
    // }

    // @Override
    // public String toMarkDown() {
    //     return text;
    // }
}
