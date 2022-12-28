package com.example.anime_db.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {
    @SerializedName("last_visible_page")
    @Expose
    private Integer lastVisiblePage;
    @SerializedName("has_next_page")
    @Expose
    private Boolean hasNextPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("items")
    @Expose
    private Items items;

    public Integer getLastVisiblePage() {
        return lastVisiblePage;
    }

    public void setLastVisiblePage(Integer lastVisiblePage) {
        this.lastVisiblePage = lastVisiblePage;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
