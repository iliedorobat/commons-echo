package ro.webdata.echo.commons.graph;

import ro.webdata.echo.commons.Const;
import ro.webdata.echo.commons.File;

public final class Namespace {
    private static final String CC_LICENSES_LINK = "http://creativecommons.org";
    private static final String RIGHTS_LICENSES_LINK = "http://rightsstatements.org";
    public static final String URL_SEPARATOR = "/";

    // https://pro.europeana.eu/page/available-rights-statements
    public static final String[] LICENSE_NAMES = {
            "PDM", "NoC-NC", "NoC-OKLR", "CC0", "CC BY", "CC BY-SA", "CC BY-ND",
            "CC BY-NC", "CC BY-NC-SA", "CC BY-NC-ND", "InC", "InC-EDU", "InC-EU-OW", "CNE"
    };
    public static final String[] LICENSE_LINKS = {
            CC_LICENSES_LINK + "/publicdomain/mark/1.0/",
            CC_LICENSES_LINK + "/publicdomain/zero/1.0/",
            CC_LICENSES_LINK + "/licenses/by/4.0/",
            CC_LICENSES_LINK + "/licenses/by-sa/4.0/",
            CC_LICENSES_LINK + "/licenses/by-nd/4.0/",
            CC_LICENSES_LINK + "/licenses/by-nc/4.0/",
            CC_LICENSES_LINK + "/licenses/by-nc-sa/4.0/",
            CC_LICENSES_LINK + "/licenses/by-nc-nd/4.0/",
            RIGHTS_LICENSES_LINK + "vocab/NoC-NC/1.0/",
            RIGHTS_LICENSES_LINK + "vocab/NoC-OKLR/1.0/",
            RIGHTS_LICENSES_LINK + "vocab/InC/1.0/",
            RIGHTS_LICENSES_LINK + "vocab/InC-EDU/1.0/",
            RIGHTS_LICENSES_LINK + "vocab/InC-OW-EU/1.0/",
            RIGHTS_LICENSES_LINK + "vocab/CNE/1.0/"
    };

    private static final String NS_LIDO = "http://www.lido-schema.org/schema/v1.0/lido-v1.0-schema-listing.html#";
    private static final String NS_REPO = "http://opendata.cs.pub.ro/";

    public static final String NS_REPO_PROPERTY = NS_REPO + "property" + File.FILE_SEPARATOR;
    public static final String NS_REPO_RESOURCE = NS_REPO + "resource" + File.FILE_SEPARATOR;

    public static final String LINK_ID_AGENT = "Agent" + File.FILE_SEPARATOR;
    public static final String LINK_ID_AGGREGATION = "Aggregation" + File.FILE_SEPARATOR;
    public static final String LINK_ID_CHO = "CHO" + File.FILE_SEPARATOR;
    public static final String LINK_ID_EVENT = "Event" + File.FILE_SEPARATOR;
    public static final String LINK_ID_LICENSE = "License" + File.FILE_SEPARATOR;
    public static final String LINK_ID_ORGANIZATION = "Organization" + File.FILE_SEPARATOR;
    public static final String LINK_ID_PLACE = "Place" + File.FILE_SEPARATOR;
    public static final String LINK_ID_TIMESPAN = "Timespan" + File.FILE_SEPARATOR;

    public static final String NS_REPO_RESOURCE_AGENT = NS_REPO_RESOURCE + LINK_ID_AGENT;
    public static final String NS_REPO_RESOURCE_AGGREGATION = NS_REPO_RESOURCE + LINK_ID_AGGREGATION;
    public static final String NS_REPO_RESOURCE_CHO = NS_REPO_RESOURCE + LINK_ID_CHO;
    public static final String NS_REPO_RESOURCE_EVENT = NS_REPO_RESOURCE + LINK_ID_EVENT;
    public static final String NS_REPO_RESOURCE_ORGANIZATION = NS_REPO_RESOURCE + LINK_ID_ORGANIZATION;
    public static final String NS_REPO_RESOURCE_PLACE = NS_REPO_RESOURCE + LINK_ID_PLACE;
    public static final String NS_REPO_RESOURCE_TIMESPAN = NS_REPO_RESOURCE + LINK_ID_TIMESPAN;
    public static final String NS_REPO_RESOURCE_TIMESPAN_UNKNOWN = NS_REPO_RESOURCE_TIMESPAN + "unknown" + File.FILE_SEPARATOR;
    public static final String NS_REPO_RESOURCE_TIMESPAN_UNKNOWN_CENTURY = NS_REPO_RESOURCE_TIMESPAN_UNKNOWN
            + URL_SEPARATOR + Const.CENTURY_PLACEHOLDER;
    public static final String NS_REPO_RESOURCE_TIMESPAN_UNKNOWN_MILLENNIUM = NS_REPO_RESOURCE_TIMESPAN_UNKNOWN
            + URL_SEPARATOR + Const.MILLENNIUM_PLACEHOLDER;

    public static final String NS_DBPEDIA_ONTOLOGY = "https://dbpedia.org/ontology/";
    public static final String NS_DBPEDIA_RESOURCE = "https://dbpedia.org/page/";
    public static final String NS_DBPEDIA_PROPERTY = "https://dbpedia.org/property/";

    private Namespace() {}
}
