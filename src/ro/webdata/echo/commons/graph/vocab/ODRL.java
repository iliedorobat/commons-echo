package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

//TODO: add all resources and properties
public final class ODRL {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://www.w3.org/ns/odrl/2/";
    public static final Resource NAMESPACE = m.createResource(NS);

    public static final Property inheritFrom = m.createProperty(NS + "inheritFrom");

    private ODRL() {}

    public static String getURI() {
        return NS;
    }
}
