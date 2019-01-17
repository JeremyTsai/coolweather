package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by JeremyTsai on 2019/1/17.
 * CopyRight@ 深医信息技术（深圳）有限公司
 * <p>
 * <p>@describe: </p>
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callBack) {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callBack);

    }

}
