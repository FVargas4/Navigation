package com.example.navigation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.widget.ImageButton;

import com.example.navigation.R;

public class HomeFragment extends Fragment {

    ImageButton galeria;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        /*galeria = findViewById(R.id.botonGaleria);
        galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { View gal = inflater.inflate(R.layout.fragment_gallery, container,false); return gal;}
        });*/
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        return root;
    }

}