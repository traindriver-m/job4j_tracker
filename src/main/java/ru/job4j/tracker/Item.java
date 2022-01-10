package ru.job4j.tracker;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Item {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now().truncatedTo(ChronoUnit.MICROS);

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setTime(LocalDateTime time) {
        created = time;
    }

    public Timestamp getTime() {
        return Timestamp.valueOf(created);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id="
                + id + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        if (id != item.id) {
            return false;
        }
        if (name != null ? !name.equals(item.name) : item.name != null) {
            return false;
        }
        return created != null ? created.equals(item.created) : item.created == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }
}