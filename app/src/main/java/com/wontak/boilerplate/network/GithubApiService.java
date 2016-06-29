package com.wontak.boilerplate.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubApiService
{
    @GET("/users/{username}")
    Call getUser(
            @Path("username") String username
    );

    @GET("/users/{username}/repos")
    Call getUsersRepositories(
            @Path("username") String username
    );
}