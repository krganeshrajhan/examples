package example.design.pattern.behavioral.nullPattern.builder;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class NullCustomer extends AbstractCustomer {
    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
