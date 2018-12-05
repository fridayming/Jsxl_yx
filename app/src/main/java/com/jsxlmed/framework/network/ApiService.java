package com.jsxlmed.framework.network;


import com.jsxlmed.ui.tab1.bean.bean.FreeCourseEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    String baseUrl = "http://appm.jsxlmed.com/app/";
    //String baseUrl = "http://192.168.1.194:8080/app/";
    //home页数据
    @GET("indexinfo")
    Observable<FreeCourseEntity> getMainData();


}
