package Collections.HashTablePkg;

/**
 * Created by sdodia on 1/29/18.
 */
public class GetterSetterMethods {
    public String first_name;
    public String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public GetterSetterMethods(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetterSetterMethods that = (GetterSetterMethods) o;

        if (getFirst_name() != null ? !getFirst_name().equals(that.getFirst_name()) : that.getFirst_name() != null)
            return false;
        return getLast_name() != null ? getLast_name().equals(that.getLast_name()) : that.getLast_name() == null;

    }

    @Override
    public int hashCode() {
        int result = getFirst_name() != null ? getFirst_name().hashCode() : 0;
        result = 31 * result + (getLast_name() != null ? getLast_name().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GetterSetterMethods{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
