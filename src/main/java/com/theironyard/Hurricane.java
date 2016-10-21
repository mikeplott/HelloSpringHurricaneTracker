package com.theironyard;

import javax.persistence.*;

/**
 * Created by michaelplott on 10/21/16.
 */
@Entity
@Table(name = "hurricanes")
public class Hurricane {
    enum Category {
        ONE,TWO,THREE,FOUR,FIVE
    }

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    Category category;

    @Column(nullable = false)
    String image;

    public Hurricane() {
    }

    public Hurricane(int id, String name, String location, Category category, String image) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.image = image;
    }
}
