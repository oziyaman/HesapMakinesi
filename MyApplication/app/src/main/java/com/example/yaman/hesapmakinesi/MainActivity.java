package com.example.yaman.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView twSonuc;
    EditText etilkSayi;
    EditText etikinciSayi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etilkSayi=(EditText)findViewById(R.id.etilkSayi);
        etikinciSayi=(EditText)findViewById(R.id.etikinciSayi);
        twSonuc=(TextView)findViewById(R.id.twSonuc);
    }

    public void mod(View view) {
        float ilkSayi = 0f;
        float ikinciSayi = 0f;
        float sonuc = 0f;
        ilkSayi = Float.parseFloat(etilkSayi.getText().toString());
        ikinciSayi = Float.parseFloat(etikinciSayi.getText().toString());
        sonuc = ilkSayi % ikinciSayi;
        twSonuc.setText(sonuc + "");
    }

    public void bol(View view) {
        float ilkSayi = 0f;
        float ikinciSayi = 0f;
        float sonuc = 0f;
        ilkSayi = Float.parseFloat(etilkSayi.getText().toString());
        ikinciSayi = Float.parseFloat(etikinciSayi.getText().toString());
        sonuc = ilkSayi / ikinciSayi;
        twSonuc.setText(sonuc + "");
    }

    public void carp(View view) {
        float ilkSayi = 0f;
        float ikinciSayi = 0f;
        float sonuc = 0f;
        ilkSayi = Float.parseFloat(etilkSayi.getText().toString());
        ikinciSayi = Float.parseFloat(etikinciSayi.getText().toString());
        sonuc = ilkSayi * ikinciSayi;
        twSonuc.setText(sonuc + "");

    }

    public void cikar(View view) {
        float ilkSayi = 0f;
        float ikinciSayi = 0f;
        float sonuc = 0f;
        ilkSayi = Float.parseFloat(etilkSayi.getText().toString());
        ikinciSayi = Float.parseFloat(etikinciSayi.getText().toString());
        sonuc = ilkSayi - ikinciSayi;
        twSonuc.setText(sonuc + "");
    }

    public void topla(View view) {
        float ilkSayi = 0f;
        float ikinciSayi = 0f;
        float sonuc = 0f;
        ilkSayi = Float.parseFloat(etilkSayi.getText().toString());
        ikinciSayi = Float.parseFloat(etikinciSayi.getText().toString());
        sonuc = ilkSayi + ikinciSayi;
        twSonuc.setText(sonuc + "");
    }
}
