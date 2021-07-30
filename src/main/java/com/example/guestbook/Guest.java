package com.example.guestbook;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Guest {
    @NotNull
    @Min(1)
    private long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String date;

    @NotEmpty
    @Size(min=5, max= 200)
    private String wishes;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getWishes() {
        return wishes;
    }
    public void setWishes(String wishes) {
        this.wishes = wishes;
    }
}
