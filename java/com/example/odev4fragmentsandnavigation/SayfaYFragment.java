package com.example.odev4fragmentsandnavigation;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev4fragmentsandnavigation.databinding.FragmentSayfaYBinding;
import com.google.android.material.snackbar.Snackbar;

public class SayfaYFragment extends Fragment {

    private FragmentSayfaYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false);

        OnBackPressedCallback anaSayfayaGeri = new OnBackPressedCallback(false) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textViewSayfaY, "Anasayfaya dönmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
                        .setAction("EVET",v-> {

                            Navigation.findNavController(v).navigate(R.id.anasayfaDonus);
                        }).show();

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),anaSayfayaGeri);

        return binding.getRoot();
    }
}