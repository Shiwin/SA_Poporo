package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public class WallDecorator extends Decorator {
    public WallDecorator(Page p) {
        super(p);
    }

    @Override
    public void Draw () {
        System . out . println ( "Draw in class WallDecorator " );
        super.Draw();
        DrawWall ();
    }

    private void DrawWall() {
        System.out.println("DrawWall in class WallDecorator");
    }

    @Override
    public void comment(ContentItem c1, ContentItem c2) {
        if (c1 != null) {
            super.comment(c1, c2);
        }
    }

    @Override
    public Boolean has(ContentItem c1, ContentItem c2) {
        return c1.content.contains(c2)&&content.contains(c1);
    }

    @Override
    public boolean isDefinedAt(ContentItem c1) {
        return !c1.content.isEmpty();
    }

    @Override
    public boolean isEmptyPage() {
        return super.isEmptyPage()&&page==null;
    }

    @Override
    public boolean containsContentItem(ContentItem c1) {
        return super.containsContentItem(c1);
    }

    @Override
    public boolean remove(ContentItem c1) {
        boolean result = content.remove(c1);

        if (super.content.size()==0){
            content.add(new StandardContentItem());
        }
        return result;
    }
}
