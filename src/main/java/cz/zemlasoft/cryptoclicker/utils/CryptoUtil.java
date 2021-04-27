package cz.zemlasoft.cryptoclicker.utils;

import com.github.kittinunf.fuel.FuelKt;
import com.github.kittinunf.fuel.core.FuelError;


import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import cz.zemlasoft.cryptoclicker.models.CurrencyRateModel;
import kotlin.Pair;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;


import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Startup
@Singleton
public class CryptoUtil {
    private final String API_KEY = "E273EBCA-07E2-4E36-B7BC-F0E94A8AA950";
    private final String url = "https://rest.coinapi.io/v1/exchangerate/BTC/USD";

    @Schedule(second = "0", minute = "*", hour = "*")
    public void atSchedule() throws InterruptedException {
        try {
            if(!new File("btchistory.json").exists()) {


                OkHttpClient client = new OkHttpClient();
                Gson gson = new Gson();
                Request request = new Request.Builder()
                        .url("https://coingecko.p.rapidapi.com/coins/bitcoin/market_chart/range?from=1392577232&vs_currency=usd&to=1615910089")
                        .get()
                        .addHeader("x-rapidapi-key", "a461291c68mshd2743a8c126cdb7p1be91djsne3b0d7b3d0fe")
                        .addHeader("x-rapidapi-host", "coingecko.p.rapidapi.com")
                        .build();

                Response response = client.newCall(request).execute();
                String output = response.body().string();
                System.out.println("File created");
                FilesKt.writeText(new File("btchistory.json"), output, StandardCharsets.UTF_8);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
