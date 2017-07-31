package com.example.cobeosijek.nkkutjevo.common.utils;

import com.github.mikephil.charting.data.RadarEntry;

import java.util.ArrayList;
import java.util.List;

public class RadarChartUtils {
    public static List<RadarEntry> createRadarEntries() {
        List<RadarEntry> entries = new ArrayList<>();

        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(12));
        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(8));
        entries.add(new RadarEntry(8));

        return entries;
    }

    public static List<String> createRadarLabels() {
        List<String> labels = new ArrayList<>();

        labels.add("Defending");
        labels.add("Physical");
        labels.add("Speed");
        labels.add("Creativity");
        labels.add("Attacking");
        labels.add("Technical");
        labels.add("Aerial");
        labels.add("Mental");

        return labels;
    }
}
