public class Class {

    private final String nameRRR;

    private final String surname;

    private final Integer age;

    private final Integer a;

    private final String b;

    private final Integer c;


    public Class(String name, String surname, Integer age, Integer a, String b, Integer c) {
        this.nameRRR = name;
        this.surname = surname;
        this.age = age;
        this.a = a;
        this.b = b;
        this.c = c;
    }

//efwefew
    public String getNameRRR() {
        return nameRRR;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + nameRRR + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", cввв=" + c +
                '}';
    }


}
