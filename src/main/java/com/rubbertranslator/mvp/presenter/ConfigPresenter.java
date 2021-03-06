package com.rubbertranslator.mvp.presenter;

import com.rubbertranslator.system.SystemConfigurationManager;
import com.rubbertranslator.mvp.view.ISceneView;

public abstract class ConfigPresenter {
    protected ISceneView scene;

    public void setView(ISceneView view){
        if(configManger == null) throw new NullPointerException("inject config first");
        this.scene = view;
        view.initViews(configManger.getSystemConfiguration());
    }

    protected SystemConfigurationManager configManger;

    public void setConfigManger(SystemConfigurationManager configManger) {
        this.configManger = configManger;
    }
}
