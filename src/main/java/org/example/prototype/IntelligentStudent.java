package org.example.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {

    }


    public IntelligentStudent(IntelligentStudent student) {
        super(student); // first copy all the attributes of Student class.
        this.iq = student.iq; //then copy the attributes from child class.
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
