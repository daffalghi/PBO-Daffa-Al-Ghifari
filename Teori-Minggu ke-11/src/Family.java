import java.util.*;

public class Family {
    private Set<Uncle> uncles;
    private Set<Niece> nieces;

    public Family() {
        this.uncles = new TreeSet<>();
        this.nieces = new TreeSet<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            return false;
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            return false;
        }
        uncles.add(new Uncle(name));
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        for (Niece niece : nieces) {
            System.out.println(niece.getName() + " - Birthday: " + niece.getBirthday());
        }
    }

    public void listUncles() {
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
}
