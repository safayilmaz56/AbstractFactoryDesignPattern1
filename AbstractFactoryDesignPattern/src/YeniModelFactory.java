public class YeniModelFactory implements IBaseFactory {
    @Override
    public ISandalye sandalyeOlustur() {
        return new YeniSandalye();
    }

    @Override
    public IMasa masaOlustur() {
        return new YeniMasa();
    }

    @Override
    public IKanepe kanepeOlustur() {
        return new YeniKanepe();
    }
}
