package com.example.financialreasons.debtLevel;

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

public class DebtLevelFragment extends Fragment {
    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_debt_level, container, false);
        EditText passive_total = root.findViewById(R.id.passive_total);
        EditText active_total = root.findViewById(R.id.active_total);
        Button calculate = root.findViewById(R.id.button_debt_level);
        TextView result = root.findViewById(R.id.result_debt_level);

        calculate.setOnClickListener(v -> {
            String passive = passive_total.getText().toString();
            String active = active_total.getText().toString();
            if(!passive.equals("") && !active.equals("") && Float.parseFloat(active) != 0) {
                float total = Float.parseFloat(passive)  / Float.parseFloat(active);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
