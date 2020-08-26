package com.danilkomyshev.clubcards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.Objects;

public class MenuFragment extends Fragment {
    TextView about;
    //    TextView news = findViewById(R.id.newsLine);
//    TextView pa = findViewById(R.id.programs);
//    TextView blog = findViewById(R.id.blog);
//    TextView contacts = findViewById(R.id.contacts);
//    TextView gallery = findViewById(R.id.gallery);
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
        about = requireView().findViewById(R.id.aboutUs);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_menuFragment_to_aboutFragment);
            }
        });
    }
}