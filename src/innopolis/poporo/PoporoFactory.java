package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class PoporoFactory {
    public abstract ContentItem createContentItem();

    public abstract Page createPage();

    public abstract User createUser();
}
