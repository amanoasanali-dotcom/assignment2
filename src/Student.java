class Student extends Person {
    private static int nextStudentId = 1;
    private final int id;
    private double gpa;
    private static final double STIPEND_AMOUNT = 36660.00;
    private static final double MIN_GPA_FOR_STIPEND = 2.67;


    public Student() {
        super();
        this.id = nextStudentId++;
        this.gpa = 0.0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.id = nextStudentId++;
        this.gpa = gpa;
    }


    @Override
    public int getId() {
        return id;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > MIN_GPA_FOR_STIPEND) {
            return STIPEND_AMOUNT;
        }
        return 0.0;
    }
}
