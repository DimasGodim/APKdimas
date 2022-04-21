package com.example.apkdimas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ListSiswaFragment extends Fragment {
private SiswaAdapter siswaAdapter;
private ListView listSiswa;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_siswa_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList<Siswa> arrayList=new ArrayList<>();
        arrayList.add(new Siswa("1","deddy"));
        arrayList.add(new Siswa("1","deddy"));
        arrayList.add(new Siswa("1","deddy"));
        arrayList.add(new Siswa("1","deddy"));
        arrayList.add(new Siswa("1","deddy"));
        arrayList.add(new Siswa("1","deddy"));
        listSiswa = view.findViewById(R.id.list_siswa);
        siswaAdapter=new SiswaAdapter(getActivity(),0,arrayList);
        listSiswa.setAdapter(siswaAdapter);
    }
}


