package isfaaghyth.app.portalti16.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import isfaaghyth.app.portalti16.R;

/**
 * Created by isfaaghyth on 26/11/18.
 * github: @isfaaghyth
 */
public class MahasiswaHolder extends RecyclerView.ViewHolder {

    public TextView txtNama;
    public TextView txtNim;

    public MahasiswaHolder(View itemView) {
        super(itemView);
        txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
        txtNim = (TextView) itemView.findViewById(R.id.txt_nim);
    }

}