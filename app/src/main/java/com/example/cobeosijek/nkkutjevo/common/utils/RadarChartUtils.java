package com.example.cobeosijek.nkkutjevo.common.utils;

import android.graphics.Color;

import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerModel;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;

import java.util.ArrayList;
import java.util.List;

public class RadarChartUtils {

    public static void createRadarChart(RadarChart radarChart, String name, PlayerModel player) {
        if (radarChart != null) {
            setupXAxis(radarChart);
            setupYAxis(radarChart);
            animateChart(radarChart);

            radarChart.getDescription().setEnabled(false);
            radarChart.getYAxis().setAxisMinimum(0);
            radarChart.setWebColor(Color.BLUE);
            radarChart.setWebColorInner(Color.BLUE);
            radarChart.setData(createRadarData(name, player));
            radarChart.invalidate();
        }
    }

    private static List<RadarEntry> createRadarEntries(PlayerModel player) {
        List<RadarEntry> entries = new ArrayList<>();

        entries.add(new RadarEntry(player.getPlayerAbilities().getDefending()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getPhysical()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getSpeed()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getCreativity()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getAttacking()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getTechnical()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getAerial()));
        entries.add(new RadarEntry(player.getPlayerAbilities().getMental()));

        return entries;
    }

    private static RadarData createRadarData(String name, PlayerModel player) {
        RadarDataSet radarDataSet = new RadarDataSet(createRadarEntries(player), name);
        radarDataSet.setColor(Color.GREEN);
        radarDataSet.setFillColor(Color.GREEN);
        radarDataSet.setDrawFilled(true);

        List<IRadarDataSet> sets = new ArrayList<>();
        sets.add(radarDataSet);

        RadarData data = new RadarData(sets);
        data.setDrawValues(false);

        return data;
    }

    private static void setupYAxis(RadarChart radarChart) {
        YAxis yAxis = radarChart.getYAxis();
        yAxis.setDrawLabels(false);
    }

    private static void setupXAxis(RadarChart radarChart) {
        XAxis xAxis = radarChart.getXAxis();
        xAxis.setDrawLabels(true);
        xAxis.setValueFormatter(new IAxisValueFormatter() {

            private String[] labels = new String[]{"Defending", "Physical", "Speed", "Creativity", "Attacking", "Technical", "Aerial", "Mental"};

            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return labels[(int) value % labels.length];
            }

            @Override
            public int getDecimalDigits() {
                return 0;
            }
        });
    }

    private static void animateChart(RadarChart radarChart) {
        radarChart.animateXY(
                1000, 1000,
                Easing.EasingOption.EaseInOutQuad,
                Easing.EasingOption.EaseInOutQuad);
    }


}
