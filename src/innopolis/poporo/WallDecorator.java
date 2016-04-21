package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public class WallDecorator extends Page {
    public WallDecorator(Page p) {
        super();
    }

    @Override
    public void Draw() {

    }

    @Override
    public void comment(ContentItem c1, ContentItem c2) {

    }

    @Override
    public boolean isDefinedAt(ContentItem c1) {
        return false;
    }

    @Override
    public boolean has(ContentItem c1, ContentItem c2) {
        return false;
    }

    @Override
    public void uncomment(ContentItem c1, ContentItem c2) {

    }
}
