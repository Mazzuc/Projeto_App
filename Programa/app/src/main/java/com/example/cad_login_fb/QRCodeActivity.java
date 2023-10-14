package com.example.cad_login_fb;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

public class QRCodeActivity extends CaptureActivity {

    private DecoratedBarcodeView barcodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        barcodeView = (DecoratedBarcodeView) initializeContent();
        barcodeView.decodeContinuous(result -> {
            // Lida com o resultado da leitura do QR code aqui
            String qrCodeContents = result.getText();
            // Por exemplo, você pode exibir o conteúdo ou fazer o que desejar com ele
        });

        // Define o texto de ajuda como vazio para remover a mensagem padrão
        barcodeView.setStatusText("");
    }

    @Override
    protected void onResume() {
        super.onResume();
        barcodeView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        barcodeView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        barcodeView.pause();
    }
}


