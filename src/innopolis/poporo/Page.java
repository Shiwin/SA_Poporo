package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class Page {

    protected User user;
    protected ArrayList<ContentItem> content;



    public boolean isEmptyPage(){
        return user==null;
    }

    public  void upload(ContentItem c1){
        content.add(c1);
    }
    public boolean remove(ContentItem c1){
        if (content.contains(c1)) {
            content.remove(c1);
            return true;
        }else {
            return false;
        }
    }

    public boolean containsContentItem(ContentItem c1){
        return content.contains(c1);
    }
    public abstract void Draw();

    public abstract void comment(ContentItem c1, ContentItem c2);

    public abstract boolean isDefinedAt(ContentItem c1);

    public abstract boolean has(ContentItem c1, ContentItem c2);

    public abstract void uncomment(ContentItem c1, ContentItem c2);
}
