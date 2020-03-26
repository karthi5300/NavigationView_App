package com.karthick.navigationviewapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewFragment extends Fragment {

    public ListViewFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listview, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_list);

        ItemAdapter adapter = new ItemAdapter(MyData.nature);
        recyclerView.setAdapter(adapter);

        //SETTING LAYOUT MANAGER
        RecyclerView.LayoutManager listLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(listLayoutManager);
        return view;
    }
}
