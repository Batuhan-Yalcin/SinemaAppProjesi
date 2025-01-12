public class BaseEntity {
    private String id;

    public BaseEntity() {
        this.id = java.util.UUID.randomUUID().toString(); // Benzersiz bir id veriliyor
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Polymorphism için bilgiGoster metodunu tanımlıyoruz
    public void bilgiGoster() {
        System.out.println("BaseEntity Bilgisi");
    }
}
