package com.example.lenovo.emptypro.ApiCallClasses.RetrofitClasses;

import com.example.lenovo.emptypro.ModelClasses.AllApiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {

     @GET("category/")
    Call<AllApiResponse.CategoryResponse> allCateListApi();

    @GET("all-pets/")
    Call<AllApiResponse.AllTypePetsRes> allTypePetsListApi();

    @FormUrlEncoded
    @POST("sold/")
    Call<AllApiResponse.SoldPetsRes> getSoldPetsApi(@Field("userID") String userID);

    @FormUrlEncoded
    @POST("uploaded/")
    Call<AllApiResponse.UploadedPetsRes> getUploadedPetsApi(@Field("userID") String userID);

    @FormUrlEncoded
    @POST("favourite/")
    Call<AllApiResponse.FavouritePetsRes> getFavouritePetsApi(@Field("userID") String userID);


    @FormUrlEncoded
    @POST("generateOTP/")
     Call<AllApiResponse.OtpResponse> getOtpApi(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("verifyOTP/")
    Call<AllApiResponse.VerifyOtpRes> verifyOtpApi(@Field("phone") String phone);


    @FormUrlEncoded
    @POST("feedback/")
    Call<AllApiResponse.CommonRes> feedbackApi(@Field("userID") String userid, @Query("message") String message);
//firstName
//lastName
//email
//phoneNo
//message
}
