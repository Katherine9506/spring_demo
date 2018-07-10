package spittr.domain;

import java.util.Objects;

public class Spitter {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public Spitter() {
    }

    public Spitter(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public Spitter(Long id, String firstName, String lastName, String username, String password) {
        this(firstName, lastName, username, password);
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spitter spitter = (Spitter) o;
        return Objects.equals(id, spitter.id) &&
                Objects.equals(firstName, spitter.firstName) &&
                Objects.equals(lastName, spitter.lastName) &&
                Objects.equals(getUsername(), spitter.getUsername()) &&
                Objects.equals(getPassword(), spitter.getPassword());
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, getUsername(), getPassword());
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
