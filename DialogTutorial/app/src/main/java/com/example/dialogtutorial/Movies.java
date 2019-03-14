package com.example.dialogtutorial;

import android.arch.persistence.room.*;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.support.annotation.NonNull;

import java.util.List;

@Entity
public class Movies {
    @NonNull
    @PrimaryKey
    private String movieId;
    private String movieName;

    public Movies(){}

    public String getMovieId() { return movieId; }
    public void setMovieId(String movieId) { this.movieId = movieId; }
    public String getMovieName() { return movieName; }
    public void setMovieName (String movieName) { this.movieName = movieName; }
}

