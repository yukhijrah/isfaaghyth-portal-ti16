package isfaaghyth.app.portalti16.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import isfaaghyth.app.portalti16.entity.Mahasiswa;

/**
 * Created by isfaaghyth on 07/01/19.
 * github: @isfaaghyth
 */

@Database(entities = {Mahasiswa.class}, version = 1, exportSchema = false)
public abstract class MahasiswaDatabase extends RoomDatabase {
    public abstract MahasiswaDao mahasiswaDao();
}
