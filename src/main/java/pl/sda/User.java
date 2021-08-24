package pl.sda;

import java.util.Objects;

public class User {
    private int id;
    private String imie;
    private String nazwisko;
    private String pesel;
    private int rokurodzenia;

    public User(int id, String imie, String nazwisko, String pesel, int rokurodzenia) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.rokurodzenia = rokurodzenia;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public int getRokurodzenia() {
        return rokurodzenia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setRokurodzenia(int rokurodzenia) {
        this.rokurodzenia = rokurodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && rokurodzenia == user.rokurodzenia && Objects.equals(imie, user.imie) && Objects.equals(nazwisko, user.nazwisko) && Objects.equals(pesel, user.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, pesel, rokurodzenia);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", rokurodzenia=" + rokurodzenia +
                '}';
    }

    
}
