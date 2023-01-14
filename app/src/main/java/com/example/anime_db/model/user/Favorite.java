package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Favorite {
    @SerializedName("anime")
    @Expose
    private List<AnimeFav> anime = null;
    @SerializedName("manga")
    @Expose
    private List<Object> manga = null;
    @SerializedName("characters")
    @Expose
    private List<CharacterFav> characters = null;
    @SerializedName("people")
    @Expose
    private List<PersonFav> people = null;

    public List<AnimeFav> getAnime() {
        return anime;
    }

    public void setAnime(List<AnimeFav> anime) {
        this.anime = anime;
    }

    public List<Object> getManga() {
        return manga;
    }

    public void setManga(List<Object> manga) {
        this.manga = manga;
    }

    public List<CharacterFav> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterFav> characters) {
        this.characters = characters;
    }

    public List<PersonFav> getPeople() {
        return people;
    }

    public void setPeople(List<PersonFav> people) {
        this.people = people;
    }
}
