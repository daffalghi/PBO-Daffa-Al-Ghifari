import java.util.*;

public class Uncle implements Comparable<Uncle> {
    private String name;
    private Map<Niece, String> presents;

    public Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient)) {
            return false;
        }

        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            if (entry.getValue().equals(description)) {
                return false;
            }
        }

        presents.put(recipient, description);
        recipient.addPresent(this, description);
        return true;
    }

    public void listPresents() {
        for (Niece niece : recipientList()) {
            String present = presents.get(niece);
            System.out.println("Niece: " + niece.getName() + ", Present: " + (present != null ? present : "No present"));
        }
    }

    private Set<Niece> recipientList() {
        Set<Niece> recipientList = new TreeSet<>(Comparator.comparing(Niece::getName));
        for (Niece niece : presents.keySet()) {
            recipientList.add(niece);
        }
        return recipientList;
    }

    @Override
    public int compareTo(Uncle other) {
        return this.name.compareTo(other.name);
    }
}
