package innopolis.poporo;

/**
 * Created by ivan on 21.04.16.
 */
public class Decorator extends StandardPage {

    protected Page page;


    public Decorator(ContentItem c) {
        super(c);
    }

    public Decorator(Page p){
        super();
        page = p;
    }

    @Override
    public void Draw() {
        System.out.println("Draw in class Decorator");
        super.Draw();
    }
}
