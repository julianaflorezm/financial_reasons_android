package com.example.financialreasons.shortTermLeverage;

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

public class ShortTermLeverageFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_short_term_leverage, container, false);
        EditText current_passive = root.findViewById(R.id.current_passive_3);
        EditText patrimony = root.findViewById(R.id.patrimony_3);
        Button calculate = root.findViewById(R.id.button_short_term_leverage);
        TextView result = root.findViewById(R.id.result_short_term_leverage);

        calculate.setOnClickListener(v -> {
            String current_p = current_passive.getText().toString();
            String patrimony_s = patrimony.getText().toString();
            if(!current_p.equals("") && !patrimony_s.equals("") && Float.parseFloat(patrimony_s) != 0) {
                float total = Float.parseFloat(current_p)  / Float.parseFloat(patrimony_s);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
