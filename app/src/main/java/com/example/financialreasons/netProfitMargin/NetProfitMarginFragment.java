package com.example.financialreasons.netProfitMargin;

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

public class NetProfitMarginFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_net_profit_magin, container, false);
        EditText net_profit = root.findViewById(R.id.net_profit);
        EditText net_sale = root.findViewById(R.id.net_sale_2);
        Button calculate = root.findViewById(R.id.button_net_profit_margin);
        TextView result = root.findViewById(R.id.result_net_profit_margin);

        calculate.setOnClickListener(v -> {
            String profit = net_profit.getText().toString();
            String sale = net_sale.getText().toString();
            if(!profit.equals("") && !sale.equals("") && Float.parseFloat(sale) != 0) {
                float total = Float.parseFloat(profit)  / Float.parseFloat(sale);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
