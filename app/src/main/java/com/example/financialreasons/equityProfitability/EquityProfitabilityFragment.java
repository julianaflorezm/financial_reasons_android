package com.example.financialreasons.equityProfitability;

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

public class EquityProfitabilityFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_equity_profitability, container, false);
        EditText net_profit = root.findViewById(R.id.net_profit_2);
        EditText patrimony = root.findViewById(R.id.patrimony);
        Button calculate = root.findViewById(R.id.button_equity_profitability);
        TextView result = root.findViewById(R.id.result_equity_profitability);

        calculate.setOnClickListener(v -> {
            String profit = net_profit.getText().toString();
            String patrimony_s = patrimony.getText().toString();
            if(!profit.equals("") && !patrimony_s.equals("") && Float.parseFloat(patrimony_s) != 0) {
                float total = Float.parseFloat(profit)  / Float.parseFloat(patrimony_s);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
