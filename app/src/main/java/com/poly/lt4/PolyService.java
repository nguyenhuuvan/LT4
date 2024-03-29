package com.poly.lt4;

import com.poly.lt4.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface PolyService {
    //http://asian.dotplays.com/wp-json/wp/v2/posts?category=18&per_page=5&paging=1

    @GET("wp-json/wp/v2/posts")
    Call<List<Post>> getPostOfCategory(@Query("category") String categoryID,
                                       @Query("per_page") String per_page,
                                       @Query("paging") String paging
                                       );
}
