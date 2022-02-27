package ro.webdata.echo.commons.accessor;

import java.util.ArrayList;
import java.util.Arrays;

public class MuseumAccessors {
    public static final String SEPARATOR = ".";
    public static final String ESCAPED_SEPARATOR = "\\.";

    public static final String ACCESS = "access";
    public static final String ACCREDITATION = "accreditation";
    public static final String ADDRESS = "address";
    public static final String ADMINISTRATIVE = "administrative";
    public static final String AGENT = "agent";
    public static final String BUILDING = "building";
    public static final String CATEGORY = "category";
    public static final String CIMEC_URI = "cimecUri";
    public static final String CLASSIFIED = "classified";
    public static final String CODE = "code";
    public static final String COLLECTION = "collection";
    public static final String COMMUNE = "commune";
    public static final String CONTACT = "contact";
    public static final String COUNTY = "county";
    public static final String DESCRIPTION = "description";
    public static final String DETAILS = "details";
    public static final String DIRECTOR = "director";
    public static final String EMAIL = "email";
    public static final String FAX = "fax";
    public static final String FOUNDED = "founded";
    public static final String GENERAL = "general";
    public static final String GEO = "geo";
    public static final String HISTORIC = "historic";
    public static final String IMPORTANCE = "importance";
    public static final String LATITUDE = "latitude";
    public static final String LMI_CODE = "lmiCode";
    public static final String LOCALITY = "locality";
    public static final String LOCATION = "location";
    public static final String LONGITUDE = "longitude";
    public static final String MAIN = "main";
    public static final String MATERIAL = "material";
    public static final String NAME = "name";
    public static final String PART_OF = "partOf";
    public static final String PHONE = "phone";
    public static final String PICTURES = "pictures";
    public static final String POSITION = "position";
    public static final String PUBLICATIONS = "publications";
    public static final String PROFILE = "profile";
    public static final String SOCIAL_MEDIA = "socialMedia";
    public static final String SUBORDINATION = "subordination";
    public static final String SUPERVISED_BY = "supervisedBy";
    public static final String SUPERVISOR_FOR = "supervisorFor";
    public static final String SUMMARY = "summary";
    public static final String TARGET = "target";
    public static final String TIMETABLE = "timetable";
    public static final String VIRTUAL_TOUR = "virtualTour";
    public static final String WEB = "web";
    public static final String ZIP_CODE = "zipCode";

    public static ArrayList<String> AVAILABLE_ACCESSORS = new ArrayList<>(
            Arrays.asList(
                    ACCESS,
                    ACCREDITATION,
                    ADDRESS,
                    ADMINISTRATIVE,
                    AGENT,
                    BUILDING,
                    CATEGORY,
                    CIMEC_URI,
                    CLASSIFIED,
                    CODE,
                    COLLECTION,
                    COMMUNE,
                    CONTACT,
                    COUNTY,
                    DESCRIPTION,
                    DETAILS,
                    DIRECTOR,
                    EMAIL,
                    FAX,
                    FOUNDED,
                    GENERAL,
                    GEO,
                    HISTORIC,
                    IMPORTANCE,
                    LATITUDE,
                    LMI_CODE,
                    LOCALITY,
                    LOCATION,
                    LONGITUDE,
                    MAIN,
                    NAME,
                    MATERIAL,
                    PART_OF,
                    PHONE,
                    PICTURES,
                    POSITION,
                    PROFILE,
                    PUBLICATIONS,
                    SOCIAL_MEDIA,
                    SUBORDINATION,
                    SUMMARY,
                    TARGET,
                    TIMETABLE,
                    VIRTUAL_TOUR,
                    WEB,
                    ZIP_CODE
            )
    );

    public static final ArrayList<String> ARRAY_VALUE_ACCESSORS = new ArrayList<>(
            Arrays.asList(
                    PICTURES
            )
    );

    public static final ArrayList<String> DOUBLE_VALUE_ACCESSORS = new ArrayList<>(
            Arrays.asList(
                    LATITUDE,
                    LONGITUDE
            )
    );

    public static final String MUSEUM_ACCREDITATION = ACCREDITATION;
    public static final String MUSEUM_CODE = CODE;
    public static final String MUSEUM_CIMEC_URI = CIMEC_URI;
    public static final String MUSEUM_FOUNDED = FOUNDED;
    public static final String MUSEUM_NAME = NAME;
    public static final String MUSEUM_SUPERVISED_BY = SUBORDINATION + SEPARATOR + SUPERVISED_BY;
    public static final String MUSEUM_SUPERVISOR_FOR = SUBORDINATION + SEPARATOR + SUPERVISOR_FOR;
    public static final String MUSEUM_COLLECTION_PART_OF = SUBORDINATION + SEPARATOR + PART_OF;

    public static final String BUILDING_DESCRIPTION = BUILDING + SEPARATOR + DESCRIPTION; // data.gov.ro
    public static final String BUILDING_LMI_CODE = BUILDING + SEPARATOR + LMI_CODE;

    public static final String COLLECTION_CLASSIFIED = COLLECTION + SEPARATOR + CLASSIFIED;
    public static final String COLLECTION_GENERAL_PROFILE = COLLECTION + SEPARATOR + PROFILE + SEPARATOR + GENERAL;
    public static final String COLLECTION_IMPORTANCE = COLLECTION + SEPARATOR + IMPORTANCE;
    public static final String COLLECTION_MAIN_PROFILE = COLLECTION + SEPARATOR + PROFILE + SEPARATOR + MAIN;
    public static final String COLLECTION_PICTURES = COLLECTION + SEPARATOR + PICTURES;

    public static final String CONTACT_DIRECTOR = CONTACT + SEPARATOR + DIRECTOR;
    public static final String CONTACT_EMAIL = CONTACT + SEPARATOR + EMAIL;
    public static final String CONTACT_FAX = CONTACT + SEPARATOR + FAX;
    public static final String CONTACT_SOCIAL_MEDIA = CONTACT + SEPARATOR + SOCIAL_MEDIA;
    public static final String CONTACT_PERSON_NAME = CONTACT + SEPARATOR + AGENT + SEPARATOR + NAME;
    public static final String CONTACT_PERSON_POSITION = CONTACT + SEPARATOR + AGENT + SEPARATOR + POSITION;
    public static final String CONTACT_PHONE = CONTACT + SEPARATOR + PHONE;
    public static final String CONTACT_TIME_TABLE = CONTACT + SEPARATOR + TIMETABLE;
    public static final String CONTACT_VIRTUAL_TOUR = CONTACT + SEPARATOR + VIRTUAL_TOUR;
    public static final String CONTACT_WEB = CONTACT + SEPARATOR + WEB;

    public static final String DESCRIPTION_DETAILS = DESCRIPTION + SEPARATOR + DETAILS;
    public static final String DESCRIPTION_HISTORIC = DESCRIPTION + SEPARATOR + HISTORIC; // data.gov.ro
    public static final String DESCRIPTION_SUMMARY = DESCRIPTION + SEPARATOR + SUMMARY; // data.gov.ro

    public static final String LOCATION_ACCESS = LOCATION + SEPARATOR + ACCESS;
    public static final String LOCATION_ADDRESS = LOCATION + SEPARATOR + ADDRESS;
    public static final String LOCATION_ADM_UNIT = LOCATION + SEPARATOR + ADMINISTRATIVE; // data.gov.ro
    public static final String LOCATION_COMMUNE = LOCATION + SEPARATOR + COMMUNE;
    public static final String LOCATION_COUNTY = LOCATION + SEPARATOR + COUNTY;
    public static final String LOCATION_GEO_LATITUDE = LOCATION + SEPARATOR + GEO + SEPARATOR + LATITUDE; // data.gov.ro
    public static final String LOCATION_GEO_LONGITUDE = LOCATION + SEPARATOR + GEO + SEPARATOR + LONGITUDE; // data.gov.ro
    public static final String LOCATION_GEO_TARGET = LOCATION + SEPARATOR + GEO + SEPARATOR + TARGET; // data.gov.ro
    public static final String LOCATION_LOCALITY_NAME = LOCATION + SEPARATOR + LOCALITY + SEPARATOR + NAME;
    public static final String LOCATION_LOCALITY_CODE = LOCATION + SEPARATOR + LOCALITY + SEPARATOR + CODE; // data.gov.ro = SIRUTA code
    public static final String LOCATION_ZIP_CODE = LOCATION + SEPARATOR + ZIP_CODE;

    public static final String PUBLICATIONS_MATERIAL = PUBLICATIONS + SEPARATOR + MATERIAL;
}
