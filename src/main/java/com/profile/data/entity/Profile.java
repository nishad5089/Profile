package com.profile.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Profile {
    @Id
    @GeneratedValue
    private long id;

    private String name;
}
