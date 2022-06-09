package com.example.financialreasons.prodRotationProcess;

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

public class ProdRotationProcessFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_prod_rotation_process, container, false);
        EditText product_cost = root.findViewById(R.id.product_cost);
        EditText ipp_avg = root.findViewById(R.id.ipp_avg);
        Button calculate = root.findViewById(R.id.button_prod_rotation_process);
        TextView result = root.findViewById(R.id.result_prod_rotation_process);

        calculate.setOnClickListener(v -> {
            String cost = product_cost.getText().toString();
            String avg = ipp_avg.getText().toString();
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
