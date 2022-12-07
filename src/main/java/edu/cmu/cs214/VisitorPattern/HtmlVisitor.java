package edu.cmu.cs214.VisitorPattern;

/**
 * visitor interface, using method overloading to visit different type of document part.
 */
public class HtmlVisitor implements Visitor {
    /**
     * visit the {@link BoldText} class and convert it to string.
     *
     * @param boldText the class to be visited
     * @return the string format of the class
     */
    @Override
    public String visit(BoldText boldText) {
      StringBuilder sb = new StringBuilder();
      sb.append("<b>").append(boldText.text()).append("</b>");
      return sb.toString();
    }

    /**
     * visit the {@link PlainText} class and convert it to string.
     *
     * @param plainText the class to be visited
     * @return the string format of the class
     */
    @Override
    public String visit(PlainText plainText) {
      return null;
    }

    /**
     * visit the {@link Hyperlink} class and convert it to string.
     *
     * @param hyperlink the class to be visited
     * @return the string format of the class
     */
    @Override
    public String visit(Hyperlink hyperlink) {
      return null;
    }

    /**
     * visit the {@link Document} class and convert it to string.
     *
     * @param document the class to be visited
     * @return the string format of the class
     */
    @Override
    public String visit(Document document) {
      StringBuilder sb = new StringBuilder();
      for (DocumentPart part : document.parts) {
        sb.append(part.accept(this));
      }
      return sb.toString();
    }
}
