public class EskiModelFactory implements IBaseFactory {

    @Override
    public ISandalye sandalyeOlustur() {
        return new EskiSandalye();
    }

    @Override
    public IMasa masaOlustur() {
        return new EskiMasa();
    }

    @Override
    public IKanepe kanepeOlustur() {
        return new EskiKanepe();
    }
}
