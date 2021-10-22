package com.example.quanlythucung.domain.common.validator;

import java.util.regex.Pattern;

/**
 * Mobile Order contants class
 * 
 * @author VNTeam
 *
 */
public class Constants {

    /**
     * Regular expression for pass
     */
    public static final Pattern REGEX_PASSWORD = Pattern.compile(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", Pattern.CASE_INSENSITIVE);

    /**
     * Regular expression for name
     */
    public static final Pattern REGEX_NAME = Pattern.compile("^[a-zA-Z0-9ぁ-んァ-ン一-龥]+$", Pattern.CASE_INSENSITIVE);

    public static final String NAME_REGEX_ACCEPT_NULL = "^[/ a-zA-Z0-9ぁ-んァ-ン一-龥]*$";

    public static final String PRODUCT_REGEX_ACCEPT_NULL = "[^/=/≠/≈/>/</≥/≤/(/)/[/]/+/-/*/×/⋅/÷/-/%/~/π/≡/x/≈/∝/∞/≪/≫/{/}/∆]*";
}
