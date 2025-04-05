package ro.webdata.echo.commons.graph;

import org.apache.jena.rdf.model.Resource;
import ro.webdata.echo.commons.Text;

public final class GraphResource {
    private GraphResource() {}

    /**
     * Generate an URI based on the namespace
     * @param namespace The namespace (see NSConstants)
     * @param resourceName The name of the resource (a country, a name, a concept etc.)
     * @param stripAccents Flag indicating if accents should be removed
     * @return The generated URI
     */
    public static String generateURI(String namespace, String resourceName, boolean stripAccents) {
        return namespace + Text.sanitizeString(resourceName, stripAccents);
    }

    /**
     * Generate an URI
     * @param namespace The namespace (E.g.: NSConstants.SIMPLE_NS_REPO_RESOURCE)
     * @param resource The resource (E.g.: EDM.Agent)
     * @param resourceName The name of the resource (E.g.: Ilie, Romania, etc.)
     * @param stripAccents Flag indicating if accents should be removed
     * @return The generated URI
     */
    public static String generateURI(String namespace, Resource resource, String resourceName, boolean stripAccents) {
        return namespace
                + resource.getLocalName() + Namespace.URL_SEPARATOR
                + Text.sanitizeString(resourceName, stripAccents);
    }

    /**
     * Generate an encoded URI using the DBPedia namespace
     * @param resourceName The name of resource (a country, a name, a concept etc.)
     * @return The DBPedia encoded URI
     */
    public static String generateDBPediaURI(String resourceName) {
        return Namespace.NS_DBPEDIA_RESOURCE
                + Text.encodeURI(resourceName);
    }
}
