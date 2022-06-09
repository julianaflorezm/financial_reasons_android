package com.example.financialreasons.finishedProductTurnover;

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

public class FinishedProductTurnoverFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_finished_product_turnover, container, false);
        EditText sales_cost = root.findViewById(R.id.sales_cost);
        EditText ipt_avg = root.findViewById(R.id.ipt_avg);
        Button calculate = root.findViewById(R.id.button_finished_product_turnover);
        TextView result = root.findViewById(R.id.result_finished_product_turnover);

        calculate.setOnClickListener(v -> {
            String cost = sales_cost.getText().toString();
            String avg = ipt_avg.getText().toString();
            if(!cost.equals("") && !avg.equals("") && Float.parseFloat(avg) != 0) {
                float total = Float.parseFloat(cost)  / Float.parseFloat(avg);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
