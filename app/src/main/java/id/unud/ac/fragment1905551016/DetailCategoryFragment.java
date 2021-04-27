package id.unud.ac.fragment1905551016;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DetailCategoryFragment extends Fragment {

    TextView tvKategoriNama;
    TextView tvKategoriDeskripsi;
    Button btnProfil;
    Button btnShowDialog;

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DESCRIPTION = "extra_description";
    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        tvKategoriNama = view.findViewById(R.id.tv_kategori_nama);
        tvKategoriDeskripsi = view.findViewById(R.id.tv_kategori_deskripsi);
        btnProfil = view.findViewById(R.id.btn_profil);
        btnShowDialog = view.findViewById(R.id.btn_show_dialog);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String kategoriNama = getArguments().getString(EXTRA_NAME);
        tvKategoriNama.setText(kategoriNama);
        tvKategoriDeskripsi.setText(getDescription());
    }

    public DetailCategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false);
    }
}