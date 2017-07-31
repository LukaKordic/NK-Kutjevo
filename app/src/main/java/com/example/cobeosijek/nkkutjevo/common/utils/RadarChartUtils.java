package com.example.cobeosijek.nkkutjevo.common.utils;

import com.github.mikephil.charting.data.RadarEntry;

import java.util.ArrayList;
import java.util.List;

public class RadarChartUtils {
    public static List<RadarEntry> createRadarEntries() {
        List<RadarEntry> entries = new ArrayList<>();

        entries.add(new RadarEntry(8, 0));
        entries.add(new RadarEntry(8, 445));
        entries.add(new RadarEntry(8, 2));
        entries.add(new RadarEntry(18, 3));
        entries.add(new RadarEntry(8, 4));
        entries.add(new RadarEntry(8, 5));
        entries.add(new RadarEntry(8, 6));
        entries.add(new RadarEntry(8, 7));

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
