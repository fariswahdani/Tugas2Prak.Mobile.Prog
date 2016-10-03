package com.example.faris.tugas2prakmobileprog;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;





public class KRS extends ActionBarActivity implements View.OnClickListener {

    Button bSubmit;
    TextView tvKRS, tvMatkul;
    EditText etNIM, etNama;
    CheckBox cbAlgo, cbRPL, cbMopro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.krs);

        etNIM = (EditText)findViewById(R.id.etNIM);
        etNama = (EditText) findViewById(R.id.etNama );
        tvKRS = (TextView) findViewById(R.id.tvKRS);
        tvMatkul = (TextView) findViewById(R.id.tvMatkul);
        cbAlgo = (CheckBox) findViewById(R.id.cbAlgo);
        cbRPL = (CheckBox) findViewById(R.id.cbRPL);
        cbMopro = (CheckBox) findViewById(R.id.cbMopro);
        bSubmit = (Button) findViewById(R.id.bSubmit);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String var_nim = etNIM.getText().toString();
                String var_nama = etNama.getText().toString();


                Intent i = null;
                i = new Intent(KRS.this, hasil_krs.class);
                Bundle b = new Bundle();
                b.putString("parse_nim",var_nim);
                b.putString("parse_nama",var_nama);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}