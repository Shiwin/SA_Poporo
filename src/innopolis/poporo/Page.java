package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class Page {

    protected User user;
    protected ArrayList<ContentItem> content;

    public Page(){
        content = new ArrayList<>();
    }


    public boolean isEmptyPage(){
        return this.content.size()==0;
    }

    public  void upload(ContentItem c1){
        if(!containsContentItem(c1)){
            content.add(c1);
        }
    }

    public boolean remove(ContentItem c1){
        if(content.size()>1){
            return content.remove(c1);

        }
        return false;
    }

    public boolean containsContentItem(ContentItem c1){
        return content.contains(c1);
    }

    public abstract void Draw();

    public void comment(ContentItem c1, ContentItem c2){
    }

    public  boolean isDefinedAt(ContentItem c1){
        return false;
    }

    public  boolean has(ContentItem c1, ContentItem c2){
        return false;
    }

    public  void uncomment(ContentItem c1, ContentItem c4){

    }
}