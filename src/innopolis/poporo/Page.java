package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class Page {

    public abstract boolean isEmptyPage();

    public abstract void upload(ContentItem c1);

    public abstract void remove(ContentItem c1);

    public abstract boolean containsContentItem(ContentItem c1);

    public abstract void Draw();

}
