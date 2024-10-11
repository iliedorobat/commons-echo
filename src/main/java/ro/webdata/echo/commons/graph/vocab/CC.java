package ro.webdata.echo.commons.graph.vocab;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public final class CC {
    private static final Model m = ModelFactory.createDefaultModel();
    public static final String NS = "http://creativecommons.org/ns#";
    public static final Resource NAMESPACE = m.createResource(NS);

    // Classes
    public static final Resource Jurisdiction = m.createResource(NS + "Jurisdiction");
    public static final Resource License = m.createResource(NS + "License");
    public static final Resource Permission = m.createResource(NS + "Permission");
    public static final Resource Prohibition = m.createResource(NS + "Prohibition");
    public static final Resource Requirement = m.createResource(NS + "Requirement");
    public static final Resource Work = m.createResource(NS + "Work");

    // Permissions
    public static final Resource DerivativeWorks = m.createResource(NS + "DerivativeWorks");
    public static final Resource Distribution = m.createResource(NS + "Distribution");
    public static final Resource Reproduction = m.createResource(NS + "Reproduction");
    public static final Resource Sharing = m.createResource(NS + "Sharing");

    //Requirements
    public static final Resource Attribution = m.createResource(NS + "Attribution");
    public static final Resource Copyleft = m.createResource(NS + "Copyleft");
    public static final Resource LesserCopyleft = m.createResource(NS + "LesserCopyleft");
    public static final Resource Notice = m.createResource(NS + "Notice");
    public static final Resource ShareAlike = m.createResource(NS + "ShareAlike");
    public static final Resource SourceCode = m.createResource(NS + "SourceCode");

    // Prohibitions
    public static final Resource CommercialUse = m.createResource(NS + "CommercialUse");
    public static final Resource HighIncomeNationUse = m.createResource(NS + "HighIncomeNationUse");

    // License Properties
    public static final Property deprecatedOn = m.createProperty(NS + "deprecatedOn");
    public static final Property legalCode = m.createProperty(NS + "legalcode");
    public static final Property jurisdiction = m.createProperty(NS + "jurisdiction");
    public static final Property permits = m.createProperty(NS + "permits");
    public static final Property prohibits = m.createProperty(NS + "prohibits");
    public static final Property requires = m.createProperty(NS + "requires");

    // Work Properties
    public static final Property attributionName = m.createProperty(NS + "attributionName");
    public static final Property attributionURL = m.createProperty(NS + "attributionURL");
    public static final Property license = m.createProperty(NS + "license");
    public static final Property morePermissions = m.createProperty(NS + "morePermissions");
    public static final Property useGuidelines = m.createProperty(NS + "useGuidelines");

    private CC() {}

    public static String getURI() {
        return NS;
    }
}
