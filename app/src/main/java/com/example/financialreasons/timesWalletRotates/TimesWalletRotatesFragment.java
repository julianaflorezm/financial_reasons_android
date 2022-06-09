package com.example.financialreasons.timesWalletRotates;

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

public class TimesWalletRotatesFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_times_wallet_rotates, container, false);
        EditText sales_credit_period = root.findViewById(R.id.sales_credit_period);
        EditText accounts_receivable = root.findViewById(R.id.accounts_receivable);
        Button calculate = root.findViewById(R.id.button_times_wallet_rotates);
        TextView result = root.findViewById(R.id.result_times_wallet_rotates);

        calculate.setOnClickListener(v -> {
            String credit_sales = sales_credit_period.getText().toString();
            String acc_receivable = accounts_receivable.getText().toString();
            if(!credit_sales.equals("") && !acc_receivable.equals("") && Float.parseFloat(acc_receivable) != 0) {
                float total = Float.parseFloat(credit_sales) / Float.parseFloat(acc_receivable);
                result.setText("Resultado = " + total);
            } else {
                result.setText("Por favor ingrese los datos requeridos.");
            }
        });
        return root;
    }
}
