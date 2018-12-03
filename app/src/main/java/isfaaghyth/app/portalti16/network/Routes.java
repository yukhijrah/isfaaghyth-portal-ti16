package isfaaghyth.app.portalti16.network;

import isfaaghyth.app.portalti16.entity.DaftarMahasiswa;
import isfaaghyth.app.portalti16.entity.Mahasiswa;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by isfaaghyth on 26/11/18.
 * github: @isfaaghyth
 */
public interface Routes {

    /**
     * mendefinisikan route dari web services yang disediakan
     * jika di deskripsikan, berarti:
     * https://ti16.herokuapp.com/list.php
     */
    @GET("list.php")
    Call<DaftarMahasiswa> getMahasiswa();

    /**
     * untuk melakukan post data mahasiswa baru
     * jika di deskripsikan, berarti:
     * https://ti16.herokuapp.com/add.php
     * @param name
     * @param nim
     */
    @POST("add.php")
    @FormUrlEncoded
    Call<Mahasiswa> postMahasiswa(
            @Field("name") String name,
            @Field("nim") String nim
    );

}
