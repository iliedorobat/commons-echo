package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public final class ORE {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://www.openarchives.org/ore/terms/";
    public static final Resource NAMESPACE = m.createResource(NS);

    public static final Resource Aggregation = m.createResource(NS + "Aggregation");
    public static final Resource AggregatedResource = m.createResource(NS + "AggregatedResource");
    public static final Resource Proxy = m.createResource(NS + "Proxy");
    public static final Resource ResourceMap = m.createResource(NS + "ResourceMap");

    public static final Property aggregates = m.createProperty(NS + "aggregates");
    public static final Property describes = m.createProperty(NS + "describes");
    public static final Property isAggregatedBy = m.createProperty(NS + "isAggregatedBy");
    public static final Property isDescribedBy = m.createProperty(NS + "isDescribedBy");
    public static final Property lineage = m.createProperty(NS + "lineage");
    public static final Property proxyFor = m.createProperty(NS + "proxyFor");
    public static final Property proxyIn = m.createProperty(NS + "proxyIn");
    public static final Property similarTo = m.createProperty(NS + "similarTo");

    private ORE() {}

    public static String getURI() {
        return NS;
    }
}
