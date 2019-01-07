package isfaaghyth.app.portalti16.data;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;

import java.util.List;

import isfaaghyth.app.portalti16.entity.Mahasiswa;

/**
 * Created by isfaaghyth on 07/01/19.
 * github: @isfaaghyth
 */
public class MahasiswaRepository {

    private final static String DB_NAME = "datalokal";
    private MahasiswaDatabase mahasiswaDatabase;

    public MahasiswaRepository(Context context) {
        mahasiswaDatabase = Room.databaseBuilder(
                context,
                MahasiswaDatabase.class,
                DB_NAME
        ).build();
    }

    public void insertMahasiswa(final Mahasiswa mahasiswa) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                mahasiswaDatabase.mahasiswaDao().insert(mahasiswa);
                return null;
            }
        }.execute();
    }

    public List<Mahasiswa> getMahasiswas() {
        return mahasiswaDatabase.mahasiswaDao().getMahasiswa();
    }

}
