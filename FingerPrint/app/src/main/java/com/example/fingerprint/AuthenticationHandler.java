package com.example.fingerprint;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.widget.Toast;

public class AuthenticationHandler extends FingerprintManager.AuthenticationCallback
{
    private MainActivity mainActivity;

    public AuthenticationHandler(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onAuthenticationError(int errorCode, CharSequence errString) {
        super.onAuthenticationError(errorCode, errString);
        Toast.makeText(mainActivity, "Authentication Error: "+errString, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
        super.onAuthenticationHelp(helpCode, helpString);
        Toast.makeText(mainActivity, "Authentication Help: "+helpString, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        super.onAuthenticationSucceeded(result);
        Toast.makeText(mainActivity, "Authentication Succeeded",Toast.LENGTH_SHORT).show();
        mainActivity.finish();
    }

    @Override
    public void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        Toast.makeText(mainActivity, "Authentication Failed", Toast.LENGTH_SHORT).show();
    }
}
