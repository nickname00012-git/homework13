public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.lastName, this.firstName);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (this.hashCode() != that.hashCode()) {
            return false;
        }
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        Author author = (Author) that;
        if (!(this.lastName.equals(author.lastName))) {
            return false;
        }
        return (this.lastName.equals(author.lastName) && this.firstName.equals(author.firstName));
    }

}
