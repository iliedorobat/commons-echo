package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public final class SVCS {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://rdfs.org/sioc/services#";
    public static final Resource NAMESPACE = m.createResource(NS);

    public static final Resource Service = m.createResource(NS + "Service");

    public static final Property hasService = m.createProperty(NS + "has_service");
    public static final Property maxResults = m.createProperty(NS + "max_results");
    public static final Property resultsFormat = m.createProperty(NS + "results_format");
    public static final Property serviceOf = m.createProperty(NS + "service_of");
    public static final Property serviceDefinition = m.createProperty(NS + "service_definition");
    public static final Property serviceEndpoint = m.createProperty(NS + "service_endpoint");
    public static final Property serviceProtocol = m.createProperty(NS + "service_protocol");

    private SVCS() {}

    public static String getURI() {
        return NS;
    }
}
