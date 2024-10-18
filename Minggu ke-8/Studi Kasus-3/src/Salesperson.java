public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return Integer.compare(this.totalSales, other.totalSales);
        }

        int lastNameComparison = other.lastName.compareTo(this.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return other.firstName.compareTo(this.firstName);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
