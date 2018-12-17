package isfaaghyth.app.portalti16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import isfaaghyth.app.portalti16.entity.Mahasiswa;
import isfaaghyth.app.portalti16.network.Network;
import isfaaghyth.app.portalti16.network.Routes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailMahasiswaActivity extends AppCompatActivity {

    private EditText edtName, edtNim;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mahasiswa);

        //casting untuk semua view
        edtName = (EditText) findViewById(R.id.edt_name);
        edtNim = (EditText) findViewById(R.id.edt_nim);
        btnAdd = (Button) findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String nim = edtNim.getText().toString();
                addNewMahasiswa(name, nim);
            }
        });
    }

    private void addNewMahasiswa(String name, String nim) {
        Routes services = Network.request().create(Routes.class);

        //lalu, kita lakukan post terhadap data mahasiswa baru dari API /add.php
        services.postMahasiswa(name, nim).enqueue(new Callback<Mahasiswa>() {
            @Override
            public void onResponse(Call<Mahasiswa> call, Response<Mahasiswa> response) {
                if (response.isSuccessful()) {
                    //ketika post nya berhasil, maka akan kembali ke mainActivity
                    finish(); //ini akan destroy si DetailMahasiswaActivity()
                } else {
                    onErrorAddMahasiswa();
                }
            }

            @Override
            public void onFailure(Call<Mahasiswa> call, Throwable t) {
                onErrorAddMahasiswa();
            }
        });
    }

    private void onErrorAddMahasiswa() {
        Toast.makeText(DetailMahasiswaActivity.this,
                "Maaf, terjadi kesalahan",
                Toast.LENGTH_LONG).show();
    }

}
