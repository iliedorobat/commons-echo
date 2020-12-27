package ro.webdata.echo.commons.graph;

public final class PlaceType {
    public static final String COUNTRY = "country";
    public static final String REGION = "region";
    public static final String COUNTY = "county";
    public static final String COMMUNE = "commune";
    public static final String LOCALITY = "locality";
    public static final String POINT = "point";

    public static final String[] TYPES = {
            COUNTRY,
            REGION,
            COUNTY,
            COMMUNE,
            LOCALITY,
            POINT
    };

    private PlaceType() {}
}
