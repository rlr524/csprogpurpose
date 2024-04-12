package Dog;

public class Dog {
    int x;
    String str;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.x != ((Simple) obj).x) {
            return false;
        }

        if (!this.str.equals(((Simple) obj).str)) {
            return false;
        }

        return true;
    }
}
