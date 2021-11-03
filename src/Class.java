public class Class {

    private final String name;

    private final String surname;
    private final String b;

    //ewefwefhtrrhrt
    public Integer getD() {
        return d;
    }

    private final Integer age;

    private final String a;

    private final Integer c;

    public String getE() {
        return e;
    }

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
//5hy45y5y45y

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
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }


}
