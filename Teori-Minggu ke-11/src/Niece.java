import java.util.*;

public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> presentsReceived;

    public Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presentsReceived = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public boolean addPresent(Uncle giver, String description) {
        if (presentsReceived.containsKey(giver)) {
            return false;
        }
        presentsReceived.put(giver, description);
        return true;
    }

    public int clearPresents() {
        int removed = presentsReceived.size();
        presentsReceived.clear();
        return removed;
    }

    public void listPresents() {
        for (Map.Entry<Uncle, String> entry : presentsReceived.entrySet()) {
            System.out.println("Uncle: " + entry.getKey().getName() + ", Present: " + entry.getValue());
        }

        for (Uncle uncle : entryList()) {
            if (!presentsReceived.containsKey(uncle)) {
                System.out.println("Uncle: " + uncle.getName() + " - No present for " + getName());
            }
        }
    }

    private Set<Uncle> entryList() {
        Set<Uncle> entryList = new TreeSet<>(Comparator.comparing(Uncle::getName));
        for (Uncle uncle : presentsReceived.keySet()) {
            entryList.add(uncle);
        }
        return entryList;
    }

    @Override
    public int compareTo(Niece other) {
        if (this.month != other.month) {
            return this.month - other.month;
        } else {
            return this.day - other.day;
        }
    }
}
