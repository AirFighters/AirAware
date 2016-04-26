package com.airfighters.airaware.api;

import android.content.Context;


import com.airfighters.airaware.BuildConfig;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetService {
	private static final int CONNECT_TIMEOUT_MILLIS = 9 * 1000; // 9s
	private static final int READ_TIMEOUT_MILLIS = 5 * 1000; // 5s
	private static final int RETROFIT_CACHE_SIZE = 5 * 1024 * 1024; // 5MB

    private static final String RETROFIT_CACHE_DIR = "retrofit-cache";
    private static final String GENYMOTION_ENDPOINT = "http://10.0.3.2/";
    private static final String LOCALHOST_ENDPOINT = "http://192.168.100.3/";
    private static final String AMAZON_ENDPOINT = "http://api.bcreaderapp.com/";

	private static Api directApi;
    private static Api cdnApi;
    static Cache cdnRetrofitCache;
	static Cache directRetrofitCache;

    static HttpLoggingInterceptor loggingInterceptor;

    public static Api getRestApi(Context ctx, String apiType) {
        return getRestApi(ctx, apiType, HttpLoggingInterceptor.Level.BASIC);
    }

	public static Api getRestApi(Context ctx, String apiType, HttpLoggingInterceptor.Level logLevel) {
        if(BuildConfig.DEBUG && loggingInterceptor == null) {
            loggingInterceptor = new HttpLoggingInterceptor();
        }

        if (loggingInterceptor != null) {
            loggingInterceptor.setLevel(logLevel);
        }

        if (directApi == null) {
            File cacheDir = new File(ctx.getCacheDir(), RETROFIT_CACHE_DIR);
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }

            directRetrofitCache = new Cache(cacheDir, RETROFIT_CACHE_SIZE);

            OkHttpClient okHttpclient;

            if (loggingInterceptor != null) {
                okHttpclient = new OkHttpClient.Builder()
                        .connectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                        .readTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                        .cache(directRetrofitCache)
                        .addInterceptor(loggingInterceptor)
                        .build();
            } else {
                okHttpclient = new OkHttpClient.Builder()
                        .connectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                        .readTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                        .cache(directRetrofitCache)
                        .build();
            }

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(AMAZON_ENDPOINT)
                    .client(okHttpclient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            directApi = retrofit.create(Api.class);
        }
        return directApi;
	}
}