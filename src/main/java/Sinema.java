import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Sinema {
    @JsonProperty("Film")
    private List<Film> films;

    @JsonProperty("Salon")
    private List<Salon> salons;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Salon> getSalons() {
        return salons;
    }

    public void setSalons(List<Salon> salons) {
        this.salons = salons;
    }
}
