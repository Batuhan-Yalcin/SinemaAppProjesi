public class Musteri extends BaseEntity implements IKayit {
    private String ad;

    // Parametresiz yapıcı
    public Musteri() {}

    // Parametreli yapıcı
    public Musteri(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Müşteri Adı: " + ad;
    }

    // Polymorphism: bilgiGoster metodunu override ediyoruz
    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri Adı: " + ad);
    }

    @Override
    public void veriKaydet() {
        System.out.println(ad + " adlı müşteri kaydedildi.");
    }

    @Override
    public void veriOku() {
        System.out.println(ad + " adlı müşteri verisi okundu.");
    }
}
