public class Main {
    public static void main(String[] args) {

         ProductManager productManager = new ProductManager(new EskiModelFactory());
         productManager.getAll();

        /*
        IBaseFactory eski = new EskiModelFactory();
        IMasa eskiMasa = eski.masaOlustur();
        IKanepe eskiKanepe = eski.kanepeOlustur();
        ISandalye eskiSandalye = eski.sandalyeOlustur();

        eskiMasa.masaBilgi();
        eskiKanepe.kanepeBilgi();
        eskiSandalye.sandalyeBilgi();

         */
    }
}