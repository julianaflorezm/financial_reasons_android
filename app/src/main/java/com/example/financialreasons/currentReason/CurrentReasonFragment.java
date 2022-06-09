package com.example.financialreasons.currentReason;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.financialreasons.R;

public class CurrentReasonFragment extends Fragment {

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_current_reason, container, false);
        EditText current_asset = root.findViewById(R.id.current_asset);
        EditText current_passive = root.findViewById(R.id.current_passive);
        Button calculate = root.findViewById(R.id.button_current_reason);
        TextView result = root.findViewById(R.id.result);

        calculate.setOnClickListener(v -> {
            String asset = current_asset.getText().toString();
            String passive = current_passive.getText().toString();
           if(!asset.equals("") && !passive.equals("") && Float.parseFloat(passive) != 0) {
               float total = Float.parseFloat(asset)  / Float.parseFloat(passive);
               result.setText("Resultado = " + total);
           } else {
               result.setText("Por favor ingrese los datos requeridos.");
           }
        });
        return root;
    }

}
