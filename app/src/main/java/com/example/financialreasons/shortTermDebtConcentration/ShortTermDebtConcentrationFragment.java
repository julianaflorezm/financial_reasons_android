package com.example.financialreasons.shortTermDebtConcentration;

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

public class ShortTermDebtConcentrationFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_short_term_debt_concentration, container, false);
        EditText current_passive = root.findViewById(R.id.current_passive_2);
        EditText passive_total = root.findViewById(R.id.passive_total_2);
        Button calculate = root.findViewById(R.id.button_short_term_debt_concentration);
        TextView result = root.findViewById(R.id.result_short_term_debt_concentration);

        calculate.setOnClickListener(v -> {
            String current_p = current_passive.getText().toString();
            String p_total = passive_total.getText().toString();
            if(!current_p.equals("") && !p_total.equals("") && Float.parseFloat(p_total) != 0) {
                float total = Float.parseFloat(current_p)  / Float.parseFloat(p_total);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
