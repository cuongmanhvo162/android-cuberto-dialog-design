package com.cuongmv162.cubertodialog.util;

import android.content.Context;

import com.cuongmv162.cubertodialog.R;
import com.cuongmv162.cubertodialog.data.TVSeriesData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuongvo on 5/16/17.
 */

public class DataUtil {
    public static List<TVSeriesData> getTVSeriesList(Context context) {
        List<TVSeriesData> list = new ArrayList<>();

        TVSeriesData dexter = new TVSeriesData();
        dexter.setTitle(context.getString(R.string.dexter));
        dexter.setImage(R.drawable.dexter);
        list.add(dexter);

        TVSeriesData shameless = new TVSeriesData();
        shameless.setTitle(context.getString(R.string.shameless));
        shameless.setImage(R.drawable.shameless);
        list.add(shameless);

        TVSeriesData houseOfCards = new TVSeriesData();
        houseOfCards.setTitle(context.getString(R.string.house_of_cards));
        houseOfCards.setImage(R.drawable.house_of_cards);
        list.add(houseOfCards);

        TVSeriesData gameOfThrones = new TVSeriesData();
        gameOfThrones.setTitle(context.getString(R.string.game_of_thrones));
        gameOfThrones.setImage(R.drawable.game_of_thrones);
        list.add(gameOfThrones);

        TVSeriesData suits = new TVSeriesData();
        suits.setTitle(context.getString(R.string.suits));
        suits.setImage(R.drawable.suits);
        list.add(suits);

        TVSeriesData gotham = new TVSeriesData();
        gotham.setTitle(context.getString(R.string.gotham));
        gotham.setImage(R.drawable.gotham);
        list.add(gotham);

        TVSeriesData breakingBad = new TVSeriesData();
        breakingBad.setTitle(context.getString(R.string.breaking_bad));
        breakingBad.setImage(R.drawable.breaking_bad);
        list.add(breakingBad);

        TVSeriesData marcoPolo = new TVSeriesData();
        marcoPolo.setTitle(context.getString(R.string.marco_polo));
        marcoPolo.setImage(R.drawable.marco_polo);
        list.add(marcoPolo);

        return list;

    }

}
