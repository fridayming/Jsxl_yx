package com.jsxlmed.framework.network;

import com.jsxlmed.utils.LogUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils implements APPConstabts {
    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;
    private static RetrofitUtils instance;

    private static OkHttpClient getOkHttpClient() {
        if (okHttpClient == null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    //打印retrofit日志
                    if (message.length() > 3000) {
                        for (int i = 0; i < message.length(); i += 3000) {
                            if (i + 3000 < message.length()) {
                                LogUtils.d("返回数据:" + message.substring(i, i + 3000));
                            } else {
                                LogUtils.d("返回数据:" + message.substring(i, message.length()));
                            }
                        }
                    } else {
                        LogUtils.d("返回数据:" + message);
                    }
                }
            });
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            okHttpClient = builder.readTimeout(HTTP_READ_TIMEOUT, TimeUnit.MILLISECONDS).
                    connectTimeout(HTTP_READ_TIMEOUT, TimeUnit.MILLISECONDS).
                    addInterceptor(loggingInterceptor).build();
        }
        return okHttpClient;
    }

    private static RetrofitUtils createApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.baseUrl)
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        instance = new RetrofitUtils();
        return instance;
    }

    public static RetrofitUtils getInstance() {
        if (instance == null) {
            createApi();
        }
        return instance;
    }

    public ApiService getServer(){
        return retrofit.create(ApiService.class);
    }
}
