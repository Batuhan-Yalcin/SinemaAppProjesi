public class Film extends BaseEntity implements IKayit {
    private String ad;
    private int sure;  // Süre dakika olarak
    private String tur;

    // Yapıcılar
    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public interface IKayit {
        void kayitEkle();
    }
       
    
    public Film() {
        // Varsayılan yapıcı
    }

    // Getter ve Setter'lar
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Film Adı: " + ad + ", Süre: " + sure + " dk, Tür: " + tur;
    }

    // Polymorphism: bilgiGoster metodunu override ediyoruz
    @Override
    public void bilgiGoster() {
        System.out.println("Film Adı: " + ad);
        System.out.println("Film Süresi: " + sure + " dk");
        System.out.println("Film Türü: " + tur);
    }

    @Override
    public void veriKaydet() {
        System.out.println(ad + " adlı film kaydedildi.");
    }

    @Override
    public void veriOku() {
        System.out.println(ad + " adlı film verisi okundu.");
    }
}
