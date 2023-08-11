package com.react.Entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Art
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String artImage;

    private String title;

    private String description;

    private String authorName;

    private String authorBirth;

    private String authorDeath;

    private String authorImage;

    private String authorDescription;

    private String category;

    private float rating;

    private String originalPrice;

    private String salePrice;

    private String seeMoreAuthor;

}
