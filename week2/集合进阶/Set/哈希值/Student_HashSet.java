package week2.集合进阶.Set.哈希值;

public class Student_HashSet {
    private String name;
    private int age;

    public Student_HashSet() {
    }

    public Student_HashSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //要重写hashCode()方法--command+N+I--equals() and hashCode()--保证内容相同的不再出现
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student_HashSet that = (Student_HashSet) o;

        if (age != that.age) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
