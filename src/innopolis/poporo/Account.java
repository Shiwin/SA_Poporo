package innopolis.poporo;

/**
 * Created by ivan on 11.04.16.
 */
public abstract class Account {
    public abstract User openAccount ();
    public abstract void closeAccount ();
    public abstract void transmit ( ContentItem c );
    public abstract boolean contains ( ContentItem c );
}
