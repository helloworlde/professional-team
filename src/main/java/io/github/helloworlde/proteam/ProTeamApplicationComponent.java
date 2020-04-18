package io.github.helloworlde.proteam;

import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationManager;

import javax.swing.*;

public class ProTeamApplicationComponent {
    public ProTeamApplicationComponent() {
        ApplicationManager.getApplication().getMessageBus().connect().subscribe(LafManagerListener.TOPIC, source -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", ProTeamProgressBarUi.class.getName());
        UIManager.getDefaults().put(ProTeamProgressBarUi.class.getName(), ProTeamProgressBarUi.class);
    }
}
