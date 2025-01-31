package edu.cmu.cs214.VisitorPattern;

/**
 * the document part interface that can be converted to html or markdown.
 * TODO: modify the interface and create two new visitors.
 */
public interface DocumentPart {

    String accept(Visitor visitor);

    // /**
    //  * transform this document to HTML format.
    //  *
    //  * @return the string of document
    //  */
    // String toHTML();

    // /**
    //  * transform this document to MarkDown format.
    //  *
    //  * @return the string of document
    //  */
    // String toMarkDown();
}
