class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int d, int m, int y) {
        name = n;
        salary = s;
        hireday = d;
        hiremonth = m;
        hireyear = y;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return +1;
        return 0;
    }

    public int hireYear() {
        return hireyear;
    }
}
