package isfaaghyth.app.portalti16.network;

import isfaaghyth.app.portalti16.entity.DaftarMahasiswa;
import isfaaghyth.app.portalti16.entity.Mahasiswa;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by isfaaghyth on 26/11/18.
 * github: @isfaaghyth
 */
public interface Routes {

    /**
     * mendefinisikan route dari web services yang disediakan
     */
    @GET("dev/list_mahasiswa")
    Call<DaftarMahasiswa> getMahasiswa();

    /**
     * untuk melakukan post data mahasiswa baru
     * @param name
     * @param nim
     */
    @POST("dev/insert_mahasiswa")
    @FormUrlEncoded
    Call<Mahasiswa> postMahasiswa(
            @Field("name") String name,
            @Field("nim") String nim
    );

    /**
     * untuk menghapus mahasiswa berdasarkan id
     * @param mhsId
     * @return
     */
    @DELETE("mahasiswatest/{mhsId}")
    Call<Mahasiswa> deleteMahasiswa(
            @Path("mhsId") String mhsId
    );

    /**
     * untuk memperbaharui data mahasiswa
     * @param mhsId
     * @param name
     * @param nim
     * @return
     */
    @PUT("mahasiswatest/{mhsId}")
    @FormUrlEncoded
    Call<Mahasiswa> updateMahasiswa(
            @Path("mhsId") String mhsId,
            @Field("name") String name,
            @Field("nim") String nim
    );

}
