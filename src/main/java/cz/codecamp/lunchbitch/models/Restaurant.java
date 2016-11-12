package cz.codecamp.lunchbitch.models;

@SuppressWarnings("unused")
public class Restaurant {

    private String id;

    private String name;

    private Location location;

    private LunchMenu lunchmenus;

    public String getId() {
        return id;
    }

    public LunchMenu getLunchmenu() {
        return lunchmenus;
    }

    public Restaurant setLunchmenu(LunchMenu lunchmenus) {
        this.lunchmenus = lunchmenus;
        return this;
    }

    public Restaurant setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Restaurant setLocation(Location location) {
        this.location = location;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        return id != null ? id.equals(that.id) : that.id == null
                && (name != null ? name.equals(that.name) : that.name == null
                && (location != null ? location.equals(that.location) : that.location == null
                && (lunchmenus != null ? lunchmenus.equals(that.lunchmenus) : that.lunchmenus == null)));

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (lunchmenus != null ? lunchmenus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", lunchmenu=" + lunchmenus +
                '}';
    }
}
