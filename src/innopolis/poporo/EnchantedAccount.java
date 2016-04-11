package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public class EnchantedAccount extends Account {

    @Override
    public User openAccount() {
        return null;
    }

    @Override
    public void closeAccount() {

    }

    @Override
    public void transmit(ContentItem c) {

    }

    @Override
    public boolean contains(ContentItem c) {
        return false;
    }
}
