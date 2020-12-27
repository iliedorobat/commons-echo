package ro.webdata.echo.commons;

import ro.webdata.echo.commons.graph.Namespace;

import java.util.TreeSet;

public final class Collection {
    public static final String STRING_LIST_SEPARATOR = " ### ";

    private Collection() {}

    public static String treeSetToDbpediaString(TreeSet<String> treeSet) {
        StringBuilder sb = new StringBuilder();
        Object[] list = treeSet.toArray();

        for (int i = 0; i < list.length; i++) {
            String item = list[i].toString();

            if (!item.contains(Namespace.NS_REPO_RESOURCE)) {
                sb.append(Namespace.NS_DBPEDIA_RESOURCE);
                sb.append(item);

                //TODO: check for possible bugs
                /*
                // OLD:
                sb.append("http://dbpedia.org/page/");
                sb.append(item);

                // NEW:
                sb.append("http://dbpedia.org/page");
                sb.append("/");
                sb.append(item);
                 */
            } else {
                sb.append(item);
            }

            if (i < list.length - 1)
                sb.append(STRING_LIST_SEPARATOR);
        }

        return sb.toString();
    }
}
