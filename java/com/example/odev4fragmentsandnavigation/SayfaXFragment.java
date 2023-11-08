package com.example.odev4fragmentsandnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4fragmentsandnavigation.databinding.FragmentSayfaXBinding;


public class SayfaXFragment extends Fragment {

    private FragmentSayfaXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);

        binding.sayfaXtoYbuton.setOnClickListener( v-> {
            Navigation.findNavController(v).navigate(R.id.gecisXtoY);
        });

        return binding.getRoot();
    }
}