package com.example.financialreasons.workingCapital;

import android.annotation.SuppressLint;
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

public class WorkingCapitalFragment extends Fragment {
    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_working_capital, container, false);
        EditText current_asset = root.findViewById(R.id.current_asset_2);
        EditText current_passive = root.findViewById(R.id.current_passive_4);
        Button calculate = root.findViewById(R.id.button_working_capital);
        TextView result = root.findViewById(R.id.result_working_capital);

        calculate.setOnClickListener(v -> {
            String asset = current_asset.getText().toString();
            String passive = current_passive.getText().toString();
            if(!asset.equals("") && !passive.equals("")) {
                float total = Float.parseFloat(asset) - Float.parseFloat(passive);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
