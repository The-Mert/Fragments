package com.example.odev4fragmentsandnavigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4fragmentsandnavigation.databinding.FragmentSayfaBBinding;


public class SayfaBFragment extends Fragment {

   private FragmentSayfaBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaBBinding.inflate(inflater,container,false);

        binding.sayfaBtoYbutton.setOnClickListener(v-> {
            Navigation.findNavController(v).navigate(R.id.gecisBtoY);
        });

        return binding.getRoot();
    }
}