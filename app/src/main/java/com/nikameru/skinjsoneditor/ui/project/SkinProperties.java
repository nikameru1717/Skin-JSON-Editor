package com.nikameru.skinjsoneditor.ui.project;

import java.util.HashMap;

public class SkinProperties {
    // Color category
    private String MenuItemDefaultColor = "#F8D59D";
    private String MenuItemDefaultTextColor = "#FFFFFF";
    private String MenuItemSelectedTextColor = "F4EADA";
    private String MenuItemVersionsDefaultColor = "#F4EADA";

    // ComboColor category
    private String[] colors = {"#9A1537", "#50954C", "#FBDB92", "#2E9DF6"};
    private boolean forceOverride = true;

    // Layout category
    // TODO: backbutton
    private HashMap<String, Object> BackButton = new HashMap<String, Object>();
    private HashMap<String, Object> ModsButton = new HashMap<String, Object>();
    private HashMap<String, Object> OptionsButton = new HashMap<String, Object>();
    private HashMap<String, Object> RandomButton = new HashMap<String, Object>();

    private boolean useNewLayout = true;

    // Slider category
    private float sliderBodyBaseAlpha = 0.4f;
    private String sliderBodyColor = "#444444";
    private String sliderBorderColor = "#E4E4E4";
    private boolean sliderFollowComboColor = false;
    private float sliderHintAlpha = 0.8f;
    private String sliderHintColor = "#E4E4E4";
    private boolean sliderHintEnable = false;
    private int sliderHintShowMinLength = 200;
    private float sliderHintWidth = 3.5f;

    // Utils category
    private boolean disableKiai = true;
    private boolean limitComboTextLength = true;

    // ButtonLayout class
    static class ButtonLayout {
        HashMap<String, Object> buttonLayout = new HashMap<String, Object>();

        public ButtonLayout(int height, int scale, int width) {
            buttonLayout.put("h", height);
            buttonLayout.put("scale", scale);
            buttonLayout.put("w", width);
        }
    }

    // Constructor
    public SkinProperties() {

    }

    // Gets and sets
    public String getMenuItemDefaultColor() {
        return MenuItemDefaultColor;
    }

    public void setMenuItemDefaultColor(String menuItemDefaultColor) {
        MenuItemDefaultColor = menuItemDefaultColor;
    }

    public String getMenuItemDefaultTextColor() {
        return MenuItemDefaultTextColor;
    }

    public void setMenuItemDefaultTextColor(String menuItemDefaultTextColor) {
        MenuItemDefaultTextColor = menuItemDefaultTextColor;
    }

    public String getMenuItemSelectedTextColor() {
        return MenuItemSelectedTextColor;
    }

    public void setMenuItemSelectedTextColor(String menuItemSelectedTextColor) {
        MenuItemSelectedTextColor = menuItemSelectedTextColor;
    }

    public String getMenuItemVersionsDefaultColor() {
        return MenuItemVersionsDefaultColor;
    }

    public void setMenuItemVersionsDefaultColor(String menuItemVersionsDefaultColor) {
        MenuItemVersionsDefaultColor = menuItemVersionsDefaultColor;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public boolean isForceOverride() {
        return forceOverride;
    }

    public void setForceOverride(boolean forceOverride) {
        this.forceOverride = forceOverride;
    }

    public HashMap<String, Object> getBackButton() {
        return BackButton;
    }

    public void setBackButton(HashMap<String, Object> backButton) {
        BackButton = backButton;
    }

    public ButtonLayout getModsButton() {
        return ModsButton;
    }

    public void setModsButton(ButtonLayout modsButton) {
        ModsButton = modsButton;
    }

    public ButtonLayout getOptionsButton() {
        return OptionsButton;
    }

    public void setOptionsButton(ButtonLayout optionsButton) {
        OptionsButton = optionsButton;
    }

    public ButtonLayout getRandomButton() {
        return RandomButton;
    }

    public void setRandomButton(ButtonLayout randomButton) {
        RandomButton = randomButton;
    }

    public boolean isUseNewLayout() {
        return useNewLayout;
    }

    public void setUseNewLayout(boolean useNewLayout) {
        this.useNewLayout = useNewLayout;
    }

    public float getSliderBodyBaseAlpha() {
        return sliderBodyBaseAlpha;
    }

    public void setSliderBodyBaseAlpha(float sliderBodyBaseAlpha) {
        this.sliderBodyBaseAlpha = sliderBodyBaseAlpha;
    }

    public String getSliderBodyColor() {
        return sliderBodyColor;
    }

    public void setSliderBodyColor(String sliderBodyColor) {
        this.sliderBodyColor = sliderBodyColor;
    }

    public String getSliderBorderColor() {
        return sliderBorderColor;
    }

    public void setSliderBorderColor(String sliderBorderColor) {
        this.sliderBorderColor = sliderBorderColor;
    }

    public boolean isSliderFollowComboColor() {
        return sliderFollowComboColor;
    }

    public void setSliderFollowComboColor(boolean sliderFollowComboColor) {
        this.sliderFollowComboColor = sliderFollowComboColor;
    }

    public float getSliderHintAlpha() {
        return sliderHintAlpha;
    }

    public void setSliderHintAlpha(float sliderHintAlpha) {
        this.sliderHintAlpha = sliderHintAlpha;
    }

    public String getSliderHintColor() {
        return sliderHintColor;
    }

    public void setSliderHintColor(String sliderHintColor) {
        this.sliderHintColor = sliderHintColor;
    }

    public boolean isSliderHintEnable() {
        return sliderHintEnable;
    }

    public void setSliderHintEnable(boolean sliderHintEnable) {
        this.sliderHintEnable = sliderHintEnable;
    }

    public int getSliderHintShowMinLength() {
        return sliderHintShowMinLength;
    }

    public void setSliderHintShowMinLength(int sliderHintShowMinLength) {
        this.sliderHintShowMinLength = sliderHintShowMinLength;
    }

    public float getSliderHintWidth() {
        return sliderHintWidth;
    }

    public void setSliderHintWidth(float sliderHintWidth) {
        this.sliderHintWidth = sliderHintWidth;
    }

    public boolean isDisableKiai() {
        return disableKiai;
    }

    public void setDisableKiai(boolean disableKiai) {
        this.disableKiai = disableKiai;
    }

    public boolean isLimitComboTextLength() {
        return limitComboTextLength;
    }

    public void setLimitComboTextLength(boolean limitComboTextLength) {
        this.limitComboTextLength = limitComboTextLength;
    }
}