package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public class StandartProporoFactory extends PoporoFactory {
    @Override
    public ContentItem createContentItem() {
        return new StandardContentItem();
    }

    @Override
    public Page createPage() {
        return new StandardPage(new StandardContentItem());
    }

    @Override
    public User createUser() {
        return null;
    }

    @Override
    public Account createAccount() {
        return null;
    }
}
