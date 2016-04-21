package innopolis.poporo;

import java.util.ArrayList;

/**
 * Created by ivan on 11.04.16.
 */
public class StandardPage extends Page {
    public StandardPage(ContentItem c) {
        super();
        super.content.add(c);
    }

    public StandardPage() {

    }

    @Override
    public void Draw() {
        System.out.println("In class StandardPage");
    }


}
