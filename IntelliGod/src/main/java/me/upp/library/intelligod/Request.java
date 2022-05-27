package me.upp.library.intelligod;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;

public class Request {

    public static <T> Object get(final String url, final Type typeOf) {
        try {
            final InputStreamReader inputStreamReader = new InputStreamReader(new URL(url).openStream());
            return new Gson().fromJson(inputStreamReader, typeOf);
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void post(final String url) {

    }
}
