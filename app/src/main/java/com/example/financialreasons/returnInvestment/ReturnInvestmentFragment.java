package com.example.financialreasons.returnInvestment;

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

public class ReturnInvestmentFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_return_investment, container, false);
        EditText net_profit = root.findViewById(R.id.net_profit_3);
        EditText active_total = root.findViewById(R.id.active_total_2);
        Button calculate = root.findViewById(R.id.button_return_investment);
        TextView result = root.findViewById(R.id.result_return_investment);

        calculate.setOnClickListener(v -> {
            String profit = net_profit.getText().toString();
            String active = active_total.getText().toString();
            if(!profit.equals("") && !active.equals("") && Float.parseFloat(active) != 0) {
                float total = Float.parseFloat(profit)  / Float.parseFloat(active);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
