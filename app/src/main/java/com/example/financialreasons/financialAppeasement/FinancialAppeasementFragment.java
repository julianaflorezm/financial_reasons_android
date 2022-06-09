package com.example.financialreasons.financialAppeasement;

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

public class FinancialAppeasementFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_financial_appeasement, container, false);
        EditText financial_passive = root.findViewById(R.id.financial_passive);
        EditText patrimony = root.findViewById(R.id.patrimony_4);
        Button calculate = root.findViewById(R.id.button_financial_appeasement);
        TextView result = root.findViewById(R.id.result_financial_appeasement);

        calculate.setOnClickListener(v -> {
            String passive = financial_passive.getText().toString();
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
