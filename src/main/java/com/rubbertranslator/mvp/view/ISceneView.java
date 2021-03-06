package com.rubbertranslator.mvp.view;

import com.rubbertranslator.enumtype.SceneType;
import com.rubbertranslator.system.SystemConfiguration;

/**
 * view 接口
 * mainView
 */
public interface ISceneView extends IView {

    default void translateStart(){}

    default void translateEnd(){}


    default void setKeepTop(boolean isKeep){}

    default void switchScene(SceneType type){}

    /**
     * 设置翻译文本
     * @param originText 原文
     * @param translatedText 译文
     */
    default void setText(String originText, String translatedText){}


    /**
     * 下面两个接口，可修复，两个的功能，主要是bind copy &　paste动作，因为paste依赖copy
     * @param isOpen
     */
    default void autoCopy(boolean isOpen){}

    default void autoPaste(boolean isOpen){}
}
