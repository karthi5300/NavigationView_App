package com.karthick.navigationviewapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridViewFragment extends Fragment {

    public GridViewFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gridview, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_grid);

        ItemAdapter adapter = new ItemAdapter(MyData.flowers);
        recyclerView.setAdapter(adapter);

        //SETTING LAYOUT MANAGER
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        return view;
    }
}
