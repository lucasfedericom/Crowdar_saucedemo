package crowdar.search;

import net.serenitybdd.screenplay.targets.Target;

public class WikipediaArticle {
    public static final Target HEADING =  Target.the("article identifier").locatedBy("#firstHeading");
}
