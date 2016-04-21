package innopolis.poporo;


public class StandardAccount extends Account{

    private User usr;
    private StandardPage page;

    public User openAccount() {
        usr = new StandartUser();
        page = new StandardPage(null);
        page.user=usr;
        return usr;
    }

    public void transmit(ContentItem c1) {
        page.upload(c1);
    }

    public void closeAccount() {
        if(page!=null){
            page.content=null;
            page=null;
        }
    }

    public boolean contains(ContentItem c) {
        if(page==null){
            return false;
        }
        return page.containsContentItem(c);
    }
}