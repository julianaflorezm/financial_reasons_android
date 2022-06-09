package com.example.financialreasons.operatingProfitMargin;

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

public class OperatingProfitMarginFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_operating_profit_magin, container, false);
        EditText operating_profit = root.findViewById(R.id.operating_profit);
        EditText net_sale = root.findViewById(R.id.net_sale);
        Button calculate = root.findViewById(R.id.button_operating_profit_margin);
        TextView result = root.findViewById(R.id.result_operating_profit_margin);

        calculate.setOnClickListener(v -> {
            String op_profit = operating_profit.getText().toString();
            String net_sale_s = net_sale.getText().toString();
            if(!op_profit.equals("") && !net_sale_s.equals("") && Float.parseFloat(net_sale_s) != 0) {
                float total = Float.parseFloat(op_profit)  / Float.parseFloat(net_sale_s);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
