package com.example.roseapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HistoryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        TextView textView = view.findViewById(R.id.historyText);
        textView.setText("Nama ilmiah bunga mawar adalah Rosa, yang berasal dari kata Latin untuk bunga mawar. Sejarah bunga mawar telah berlangsung lama, dengan bukti bahwa bunga ini sudah ada sejak ribuan tahun lalu. Mawar pertama kali dibudidayakan di Asia Kecil dan wilayah sekitar Mediterania, lalu menyebar ke seluruh dunia. Mawar telah menjadi bagian dari kebudayaan manusia sejak zaman kuno, sering dijadikan simbol dalam mitologi, seni, dan agama. Di Romawi kuno, bunga mawar dianggap sebagai simbol cinta dan kecantikan, sedangkan dalam budaya Yunani, mawar erat kaitannya dengan dewi cinta, Aphrodite. Pada abad pertengahan, bunga mawar juga banyak digunakan dalam upacara keagamaan dan menjadi lambang status sosial.");

        return view;
    }
}
