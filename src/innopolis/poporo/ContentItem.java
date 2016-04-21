package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class ContentItem {

    protected ArrayList<ContentItem> content = new ArrayList<>();

    public ContentItem() {
    }

    public void addContent(ContentItem c){
        content.add(c);
    }

    public boolean removeContent(ContentItem c){
        return content.remove(c);
    }
}
