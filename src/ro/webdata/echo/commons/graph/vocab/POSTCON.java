package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

// TODO: https://vistech.net/~champ/online-docs/books/pracrdf/0596002637_pracrdf-chp-6-sect-3.html
public final class POSTCON {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://burningbird.net/postcon/elements/1.0/";
    public static final Resource NAMESPACE = m.createResource(NS);

    public static Resource presentation = m.createResource(NS + "presentation");

    public static Property bio = m.createProperty(NS + "bio");
    public static Property history = m.createProperty(NS + "history");
    public static Property relevancy = m.createProperty(NS + "relevancy");
    public static Property movementType = m.createProperty(NS + "movementType");
    public static Property reason = m.createProperty(NS + "reason");
    public static Property related = m.createProperty(NS + "related");
    public static Property requires = m.createProperty(NS + "requires");
    public static Property status = m.createProperty(NS + "currentStatus");
    public static Property type = m.createProperty(NS + "type");

    private POSTCON() {}

    public static String getURI() {
        return NS;
    }
}
