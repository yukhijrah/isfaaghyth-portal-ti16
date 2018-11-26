package isfaaghyth.app.portalti16.network;

import isfaaghyth.app.portalti16.entity.DaftarMahasiswa;
import isfaaghyth.app.portalti16.entity.Mahasiswa;
import retrofit2.Call;
import retrofit2.http.GET;

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

}
