import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SinemaSistemi {
    public static void main(String[] args) throws IOException {
        // Film ve müşteri verileri
        Film film1 = new Film("The Matrix", 120, "Aksiyon");
        Film film2 = new Film("Inception", 148, "Bilim Kurgu");
        Musteri musteri1 = new Musteri("Ahmet Yılmaz");
        Musteri musteri2 = new Musteri("Mehmet Demir");

        // Salon oluşturuluyor
        Salon salon1 = new Salon("Salon 1");
        salon1.filmEkle(film1);
        salon1.filmEkle(film2);
        salon1.musteriEkle(musteri1);
        salon1.musteriEkle(musteri2);

        // Salon bilgilerini göster
        salon1.bilgiGoster();

        // JSON dosyasına veri kaydetme
        JsonHandler jsonHandler = new JsonHandler();
        List<Salon> salonlar = new ArrayList<>();
        salonlar.add(salon1);
        jsonHandler.saveToJson("salon.json", salonlar);
        System.out.println("Veri JSON dosyasına kaydedildi: salon.json");

        List<Film> filmler = new ArrayList<>();
        filmler.add(film1);
        filmler.add(film2);
        jsonHandler.saveToJson("film.json", filmler);
        System.out.println("Veri JSON dosyasına kaydedildi: film.json");

        List<Musteri> musteriler = new ArrayList<>();
        musteriler.add(musteri1);
        musteriler.add(musteri2);
        jsonHandler.saveToJson("musteri.json", musteriler);
        System.out.println("Veri JSON dosyasına kaydedildi: musteri.json");

        // JSON'den veri okuma
        System.out.println("\nJSON'den Okunan Film Verileri:");
        List<Film> filmListesi = (List<Film>) jsonHandler.loadFromJson("film.json", Film.class);
        for (Film f : filmListesi) {
            System.out.println(f);
        }

        System.out.println("\nJSON'den Okunan Salon Verileri:");
        List<Salon> salonListesi = (List<Salon>) jsonHandler.loadFromJson("salon.json", Salon.class);
        for (Salon s : salonListesi) {
            s.bilgiGoster();
        }
    }
}
