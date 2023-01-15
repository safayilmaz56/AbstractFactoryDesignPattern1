public class ProductManager {
    private IBaseFactory baseFactory;

    public ProductManager(IBaseFactory baseFactory) {
        this.baseFactory = baseFactory;
    }
    public void getAll(){
        baseFactory.kanepeOlustur().kanepeBilgi();
        baseFactory.masaOlustur().masaBilgi();
        baseFactory.sandalyeOlustur().sandalyeBilgi();
    }
}
