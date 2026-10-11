public class GradStudent extends PSUStudent {
    private boolean passThesis;

    public GradStudent(int age, double gpa) {
        super(age, gpa);
        this.passThesis = false;
    }

    public boolean isPassThesis() {
        return passThesis;
    }

    @Override
    public void setPassThesis(boolean passThesis) {
        this.passThesis = passThesis;
    }

    @Override
    public double revealGrade() {
        if (this.passThesis) {
            return this.gpa;
        }
        return 0.0d;
    }
}