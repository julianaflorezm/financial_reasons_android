package com.example.financialreasons.investmentTurnover;

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

public class InvestmentTurnoverFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_investment_turnover, container, false);
        EditText sale = root.findViewById(R.id.sale);
        EditText active_total = root.findViewById(R.id.active_total_3);
        Button calculate = root.findViewById(R.id.button_investment_turnover);
        TextView result = root.findViewById(R.id.result_investment_turnover);

        calculate.setOnClickListener(v -> {
            String sale_s = sale.getText().toString();
            String active = active_total.getText().toString();
            if(!sale_s.equals("") && !active.equals("") && Float.parseFloat(active) != 0) {
                float total = Float.parseFloat(sale_s)  / Float.parseFloat(active);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
