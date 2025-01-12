import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity implements IKayit {
    private String ad;
    private List<Film> filmler;
    private List<Musteri> musteriListesi;

    // Varsayılan yapıcı
    public Salon() {
        this.filmler = new ArrayList<>();
        this.musteriListesi = new ArrayList<>();
    }

    public Salon(String ad) {
        this.ad = ad;
        this.filmler = new ArrayList<>();
        this.musteriListesi = new ArrayList<>();
    }

    // Getter ve Setter
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Film> getFilmler() {
        return filmler;
    }

    public void setFilmler(List<Film> filmler) {
        this.filmler = filmler;
    }

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }

    public void setMusteriListesi(List<Musteri> musteriListesi) {
        this.musteriListesi = musteriListesi;
    }

    public void filmEkle(Film film) {
        filmler.add(film);
    }

    public void musteriEkle(Musteri musteri) {
        musteriListesi.add(musteri);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon Adı: " + ad);
        System.out.println("Gösterilen Filmler:");
        for (Film film : filmler) {
            film.bilgiGoster();
        }
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : musteriListesi) {
            musteri.bilgiGoster();
        }
    }

    @Override
    public void veriKaydet() {
        System.out.println(ad + " adlı salon kaydedildi.");
    }

    @Override
    public void veriOku() {
        System.out.println(ad + " adlı salon verisi okundu.");
    }
}
