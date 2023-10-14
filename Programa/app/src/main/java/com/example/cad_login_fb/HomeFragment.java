package com.example.cad_login_fb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomeFragment extends Fragment {

    private LinearLayout novidadesLayout;
    private LinearLayout atracoesLayout;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Cards Novidades
        novidadesLayout = view.findViewById(R.id.novidades_layout);

        addNovidadesCard("Primata Marrom", "Nova espécie de Primata Marrom, chega ao Zoo Curitiba.\n" +
                "Nova espécie de Primata Marrom, chega ao Zoo Curitiba.", R.drawable.novidade1);
        addNovidadesCard("Primata Marrom", "Nova espécie de Primata Marrom, chega ao Zoo Curitiba.\n" +
                "Nova espécie de Primata Marrom, chega ao Zoo Curitiba.", R.drawable.novidade1);

        // Cards Atrações
        atracoesLayout = view.findViewById(R.id.atracoes_layout);

        addAtracoesCard("Colônia das Formigas", "09:00 - 12:00", R.drawable.atracoes1);
        addAtracoesCard("Pavão do Egito", "09:00 - 12:00", R.drawable.atracoes2);

        return view;
    }

    private void addNovidadesCard(String title, String info, int imageResId) {
        NovidadesCard novidadesCard = new NovidadesCard(requireContext(), title, info, imageResId);
        novidadesLayout.addView(novidadesCard);
    }

    private void addAtracoesCard(String title, String info, int imageResId) {
        AtracoesCard atracoesCard = new AtracoesCard(requireContext(), title, info, imageResId);
        atracoesLayout.addView(atracoesCard);
    }
}
