package circuits;

public class TrueGate extends Gate {

    private TrueGate() {
        super(null);
    }

    public static Gate instance() {

    }

    @Override
    protected boolean func(boolean[] inValues) throws CircuitException {
        return true;
    }

    @Override
    public String getName() {
        return "T";
    }

    @Override
    public Gate simplify() {
        return null;
    }
}
