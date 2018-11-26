package isfaaghyth.app.portalti16.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by isfaaghyth on 26/11/18.
 * github: @isfaaghyth
 */
public class Network {

    public static Retrofit request() {
        return new Retrofit.Builder()
                //ini main url dari web services yang tersedia
                .baseUrl("https://ti16.herokuapp.com/")
                //ini melakukan konversi dari json string ke java object
                .addConverterFactory(GsonConverterFactory.create())
                //build it!
                .build();
    }

}
