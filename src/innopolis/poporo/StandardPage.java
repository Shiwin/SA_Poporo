package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public class StandardPage extends Page {
    public StandardPage(ContentItem c) {
        super.user = null;
        super.content = new ArrayList<>();
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
