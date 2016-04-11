package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public class WallDecorator extends Page {
    public WallDecorator(StandardPage p) {
        super();
    }

    @Override
    public boolean isEmptyPage() {
        return false;
    }

    @Override
    public void upload(ContentItem c1) {

    }

    @Override
    public void remove(ContentItem c1) {

    }

    @Override
    public boolean containsContentItem(ContentItem c1) {
        return false;
    }

    @Override
    public void Draw() {

    }
}
