package com.example.roseapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_description, container, false);

        TextView textView = view.findViewById(R.id.descriptionText);
        textView.setText("Bunga mawar (Rosa) adalah salah satu bunga yang paling dikenal dan populer di dunia, terkenal karena keindahan, aromanya yang khas, serta simbolisme yang mendalam. Mawar memiliki kelopak yang halus dan sering kali berwarna merah, putih, kuning, atau pink. Bunga ini sering dijadikan simbol cinta, keindahan, dan penghargaan. Mawar dapat tumbuh dalam berbagai ukuran, dari semak-semak kecil hingga tanaman merambat yang dapat mencakup area yang luas. Mawar juga dapat ditemukan dalam berbagai jenis, seperti mawar taman, mawar liar, atau mawar hibrida yang memiliki berbagai macam warna dan bentuk kelopak.\n");

        return view;
    }
}
