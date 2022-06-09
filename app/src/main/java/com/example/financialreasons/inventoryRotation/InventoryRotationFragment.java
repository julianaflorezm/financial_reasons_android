package com.example.financialreasons.inventoryRotation;

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

public class InventoryRotationFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_inventory_rotation, container, false);
        EditText ware_sold_cost = root.findViewById(R.id.ware_sold_cost);
        EditText avg_ware_inventory = root.findViewById(R.id.avg_ware_inventory);
        Button calculate = root.findViewById(R.id.button_inventory_rotation);
        TextView result = root.findViewById(R.id.result_inventory_rotation);

        calculate.setOnClickListener(v -> {
            String cost = ware_sold_cost.getText().toString();
            String avg = avg_ware_inventory.getText().toString();
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
