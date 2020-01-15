package com.example.tabi.ui.journey;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tabi.R;

public class JourneyFragment extends Fragment {

    private JourneyViewModel journeyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        journeyViewModel =
                ViewModelProviders.of(this).get(JourneyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_journey, container, false);
        final TextView textView = root.findViewById(R.id.text_journey);
        journeyViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}