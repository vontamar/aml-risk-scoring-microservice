package com.example.aml.util;

import java.util.Set;

public class HighRiskCountries {
    private static final Set<String> highRiskCountries = Set.of("North Korea", "Iran", "Syria");
    public static boolean isHighRisk(String country) {
        return highRiskCountries.contains(country);
    }
}
