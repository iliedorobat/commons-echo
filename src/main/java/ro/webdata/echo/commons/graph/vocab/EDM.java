package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

// TODO: new ResourceImpl && new PropertyImpl vs m.createResource && m.createProperty
public final class EDM {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://www.europeana.eu/schemas/edm/";
    public static final Resource NAMESPACE = m.createResource(NS);

    public static final Resource Agent = m.createResource(NS + "Agent");
    public static final Resource EuropeanaAggregation = m.createResource(NS + "EuropeanaAggregation");
    public static final Resource EuropeanaObject = m.createResource(NS + "EuropeanaObject");
    public static final Resource Event = m.createResource(NS + "Event");
    public static final Resource InformationResource = m.createResource(NS + "InformationResource");
    public static final Resource NonInformationResource = m.createResource(NS + "NonInformationResource");
    public static final Resource PhysicalThing = m.createResource(NS + "PhysicalThing");
    public static final Resource Place = m.createResource(NS + "Place");
    public static final Resource ProvidedCHO = m.createResource(NS + "ProvidedCHO");
    public static final Resource TimeSpan = m.createResource(NS + "TimeSpan");
    public static final Resource WebResource = m.createResource(NS + "WebResource");

    public static final Property acronym = m.createProperty(NS + "acronym");
    public static final Property aggregatedCHO = m.createProperty(NS + "aggregatedCHO");
    public static final Property begin = m.createProperty(NS + "begin");
    /**
     * This property is deprecated and <b>edm:datasetName</b> should be used instead
     * @deprecated
     */
    @Deprecated
    public static final Property collectionName = m.createProperty(NS + "collectionName");
    public static final Property country = m.createProperty(NS + "country");
    public static final Property currentLocation = m.createProperty(NS + "currentLocation");
    public static final Property datasetName = m.createProperty(NS + "datasetName");
    public static final Property dataProvider = m.createProperty(NS + "dataProvider");
    public static final Property end = m.createProperty(NS + "end");
    public static final Property intermediateProvider = m.createProperty(NS + "intermediateProvider");
    public static final Property europeanaProxy = m.createProperty(NS + "europeanaProxy");
    public static final Property europeanaRole = m.createProperty(NS + "europeanaRole");
    public static final Property geographicLevel = m.createProperty(NS + "geographicLevel");
    public static final Property happenedAt = m.createProperty(NS + "happenedAt");
    public static final Property hasMet = m.createProperty(NS + "hasMet");
    public static final Property hasType = m.createProperty(NS + "hasType");
    public static final Property hasView = m.createProperty(NS + "hasView");
    public static final Property incorporates = m.createProperty(NS + "incorporates");
    /**
     * This property is deprecated and replaced by an implementation of the
     * <b>Web Annotation Data Model</b> to support annotations in Europeana
     * @deprecated
     */
    @Deprecated
    public static final Property isAnnotationOf = m.createProperty(NS + "isAnnotationOf");
    public static final Property isDerivativeOf = m.createProperty(NS + "isDerivativeOf");
    public static final Property isNextInSequence = m.createProperty(NS + "isNextInSequence");
    public static final Property isRelatedTo = m.createProperty(NS + "isRelatedTo");
    public static final Property isRepresentationOf = m.createProperty(NS + "isRepresentationOf");
    public static final Property isShownAt = m.createProperty(NS + "isShownAt");
    public static final Property isShownBy = m.createProperty(NS + "isShownBy");
    public static final Property isSimilarTo = m.createProperty(NS + "isSimilarTo");
    public static final Property isSuccessorOf = m.createProperty(NS + "isSuccessorOf");
    public static final Property landingPage = m.createProperty(NS + "landingPage");
    public static final Property language = m.createProperty(NS + "language");
    public static final Property object = m.createProperty(NS + "object");
    // "occuredAt" instead of "occurredAt"
    // https://github.com/europeana/corelib/wiki/EDMObjectTemplatesProviders#edmEvent
    public static final Property occurredAt = m.createProperty(NS + "occuredAt");
    public static final Property organizationDomain = m.createProperty(NS + "organizationDomain");
    public static final Property organizationScope = m.createProperty(NS + "organizationScope");
    public static final Property organizationSector = m.createProperty(NS + "organizationSector");
    public static final Property preview = m.createProperty(NS + "preview");
    public static final Property provider = m.createProperty(NS + "provider");
    public static final Property realizes = m.createProperty(NS + "realizes");
    public static final Property rights = m.createProperty(NS + "rights");
    public static final Property type = m.createProperty(NS + "type");
    public static final Property ugc = m.createProperty(NS + "ugc");
    /**
     * This property is integrated only for backward compatibility with ESE
     * and should not be used
     * @deprecated
     */
    @Deprecated
    public static final Property unstored = m.createProperty(NS + "unstored");
    /**
     * This property is integrated in EDM only for backward compatibility with ESE
     * @deprecated
     */
    @Deprecated
    public static final Property uri = m.createProperty(NS + "uri");
    /**
     * This property is deprecated and replaced by an implementation of the
     * <b>Web Annotation Data Model</b> to support annotations in Europeana
     * @deprecated
     */
    @Deprecated
    public static final Property userTag = m.createProperty(NS + "userTag");
    public static final Property wasPresentAt = m.createProperty(NS + "wasPresentAt");
    public static final Property year = m.createProperty(NS + "year");

    private EDM() {}

    public static String getURI() {
        return NS;
    }
}
