package com.example.financialreasons.totalLeverage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.financialreasons.R;

public class TotalLeverageFragment extends Fragment {
    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_total_leverage, container, false);
        EditText passive_total = root.findViewById(R.id.passive_total_3);
        EditText patrimony = root.findViewById(R.id.patrimony_2);
        Button calculate = root.findViewById(R.id.button_total_leverage);
        TextView result = root.findViewById(R.id.result_total_leverage);

        calculate.setOnClickListener(v -> {
            String passive = passive_total.getText().toString();
            String patrimony_s = patrimony.getText().toString();
            if(!passive.equals("") && !patrimony_s.equals("") && Float.parseFloat(patrimony_s) != 0) {
                float total = Float.parseFloat(passive)  / Float.parseFloat(patrimony_s);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
