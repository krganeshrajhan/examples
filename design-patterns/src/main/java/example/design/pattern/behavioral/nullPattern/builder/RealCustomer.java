package example.design.pattern.behavioral.nullPattern.builder;

/**
 * Created by krganeshrajhan on 11/12/16.
 */
public class RealCustomer extends AbstractCustomer {


    public RealCustomer(String name) {
        this.name = name;
    }

    public boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
