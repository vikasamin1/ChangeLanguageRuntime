package com.vrajaninfotech.vcare.changelanguageruntime;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private String frenchLanguageCode = "fr";
    private String hindiLanguageCode = "hi";
    private String englishLanguageCode = "en";
    private String ChineseLanguageCode = "zh";
    private String GermanLanguageCode = "de";
    private String KoreanLanguageCode = "ko";
    private String SpanishLanguageCode = "es";
    private String PortugueseLanguageCode = "pt";
    private String TurkishLanguageCode = "tr";

    private RadioButton frenchButton,hindiButton,englishButton,chineseButton;
    private RadioButton germentButton,korieanButton,spenishButton,portButton,turkishButton;
    private RadioGroup LanguageRGroup;
    private Button changeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LanguageRGroup = (RadioGroup) findViewById(R.id.LanguageRGroup);
        LanguageRGroup.clearCheck();

        changeBtn=(Button)findViewById(R.id.changeBtn);
        frenchButton=(RadioButton)findViewById(R.id.FrenchRButton);
        hindiButton=(RadioButton)findViewById(R.id.HindiRButton);
        englishButton=(RadioButton)findViewById(R.id.EnglishRButton);
        chineseButton=(RadioButton)findViewById(R.id.ChineseRButton);
        germentButton=(RadioButton)findViewById(R.id.GermanRButton);
        korieanButton=(RadioButton)findViewById(R.id.KoreanRButton);
        spenishButton=(RadioButton)findViewById(R.id.SpanishButton);
        portButton=(RadioButton)findViewById(R.id.PortugueseRButton);
        turkishButton=(RadioButton)findViewById(R.id.TurkishRbutton);

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = LanguageRGroup.getCheckedRadioButtonId();
                String t = "";
                if(selectedId==R.id.FrenchRButton)
                {
                    t = frenchLanguageCode;
                }else if(selectedId==R.id.HindiRButton)
                {
                    t = hindiLanguageCode;
                }else if(selectedId==R.id.EnglishRButton)
                {
                    t = englishLanguageCode;
                }else if(selectedId==R.id.ChineseRButton)
                {
                   t = ChineseLanguageCode;
                }else if(selectedId==R.id.GermanRButton)
                {
                   t = GermanLanguageCode;
                }else if(selectedId==R.id.KoreanRButton)
                {
                   t = KoreanLanguageCode;
                }else if(selectedId==R.id.SpanishButton)
                {
                   t = SpanishLanguageCode;
                }else if(selectedId==R.id.PortugueseRButton)
                {
                   t = PortugueseLanguageCode;
                }else if(selectedId==R.id.TurkishRbutton)
                {
                   t = TurkishLanguageCode;
                }
                setLocale(t);
            }
        });
    }

    public void setLocale(String lang) {
        if(lang.trim().equals("")){
            return;
        }
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        recreate();
    }
}
