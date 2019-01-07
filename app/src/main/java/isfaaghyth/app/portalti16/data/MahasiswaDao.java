package isfaaghyth.app.portalti16.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import isfaaghyth.app.portalti16.entity.Mahasiswa;

/**
 * Created by isfaaghyth on 07/01/19.
 * github: @isfaaghyth
 */

@Dao
public interface MahasiswaDao {

    @Insert
    void insert(Mahasiswa mahasiswa);

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getMahasiswa();

    @Update
    void update(Mahasiswa mahasiswa);

    @Delete
    void delete(Mahasiswa mahasiswa);

}
