package es.rgg.gestaulasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    String url = "https://rgg-gestaulas.herokuapp.com/consultas/consultarPortatil";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        final WebSettings settingsWebView = webView.getSettings();
        settingsWebView.setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}