
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class Ital {
    
protected String név;
protected String kiszerelés;
private static int ár;
protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés, Date gyártásiDátum) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = gyártásiDátum;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public void setGyártásiDátum(Date gyártásiDátum) {
        this.gyártásiDátum = gyártásiDátum;
    }

    @Override
    public String toString() {
        return "Ital{" + "n\u00e9v=" + név + ", kiszerel\u00e9s=" + kiszerelés + ", gy\u00e1rt\u00e1siD\u00e1tum=" + gyártásiDátum + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.gyártásiDátum, other.gyártásiDátum)) {
            return false;
        }
        return true;
    }
    
    







}
    
