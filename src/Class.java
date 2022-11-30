public class Class {

    private final String name;

    private final String surname;

    private final Integer age;

    private final String a;

    private final String b;

    private final Integer c;

    private final Integer d;

    private final String e;


    public Class(String name, String surname, Integer age, String a, String b, Integer c, Integer d, String e) {
        this.name = name;
        this.d = d;
        this.e = e;
        this.surname = surname + a+ b;
        this.age = age;
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getA() {
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
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", age =" + age +
                ", a ='" + a + '\'' +
                ", b ='" + b + '\'' +
                ", c =" + c +
                '}';
    }


}
