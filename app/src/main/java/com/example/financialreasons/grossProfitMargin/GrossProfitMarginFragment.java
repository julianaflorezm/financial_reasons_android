package com.example.financialreasons.grossProfitMargin;

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

public class GrossProfitMarginFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gross_profit_margin, container, false);
        EditText gross_profit = root.findViewById(R.id.gross_profit);
        EditText net_sale = root.findViewById(R.id.net_sale_3);
        Button calculate = root.findViewById(R.id.button_gross_profit_margin);
        TextView result = root.findViewById(R.id.result_gross_profit_margin);

        calculate.setOnClickListener(v -> {
            String gr_profit = gross_profit.getText().toString();
            String net_sale_s = net_sale.getText().toString();
            if(!gr_profit.equals("") && !net_sale_s.equals("") && Float.parseFloat(net_sale_s) != 0) {
                float total = Float.parseFloat(gr_profit)  / Float.parseFloat(net_sale_s);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
