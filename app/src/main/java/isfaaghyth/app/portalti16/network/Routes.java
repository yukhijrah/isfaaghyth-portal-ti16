package isfaaghyth.app.portalti16.network;

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
    void getMahasiswa();

}
