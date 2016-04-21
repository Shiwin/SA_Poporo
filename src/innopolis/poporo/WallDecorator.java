package innopolis.poporo;

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
        if (c1==null){
            page.content.add(c2);
        }else {
            super.comment(c1, c2);
        }
    }

    @Override
    public boolean has(ContentItem c1, ContentItem c2) {
        return c1.content.contains(c2);
    }

    @Override
    public boolean isDefinedAt(ContentItem c1) {
        return super.page.isDefinedAt(c1);
    }

    @Override
    public boolean isEmptyPage() {
        return super.isEmptyPage()&&page==null;
    }

    @Override
    public boolean containsContentItem(ContentItem c1) {
        return super.containsContentItem(c1)&&page.containsContentItem(c1);
    }
}
