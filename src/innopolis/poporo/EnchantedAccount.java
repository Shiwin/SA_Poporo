package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public class EnchantedAccount extends Account {

    private User usr;
    private EnchantedPage page;
    @Override
    public User openAccount() {
        usr = new EnchangedUser();
        page = new EnchantedPage(null);
        page.user=usr;
        return usr;
    }

    @Override
    public void closeAccount() {
        if(page!=null){
            page.content.clear();
            page=null;
        }
    }

    @Override
    public void transmit(ContentItem c) {
        page.upload(c);
    }

    @Override
    public boolean contains(ContentItem c) {
        if(page==null){
            return false;
        }
        return page.containsContentItem(c);
    }
}