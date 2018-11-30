package com.github.characterdog.materialcolor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import es.dmoral.toasty.Toasty;

import java.util.ArrayList;
import java.util.List;

import static com.github.characterdog.materialcolor.AboutActivity.EXTRA_PRIVACY_POLICY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayList<ColorItem> gridItems = new ArrayList<>();
        gridItems.add(new ColorItem(R.color.material_color_red_50,   "Red 50"));
        gridItems.add(new ColorItem(R.color.material_color_red_100,  "Red 100"));
        gridItems.add(new ColorItem(R.color.material_color_red_200,  "Red 200"));
        gridItems.add(new ColorItem(R.color.material_color_red_300,  "Red 300"));
        gridItems.add(new ColorItem(R.color.material_color_red_400,  "Red 400"));
        gridItems.add(new ColorItem(R.color.material_color_red_500,  "Red 500"));
        gridItems.add(new ColorItem(R.color.material_color_red_600,  "Red 600"));
        gridItems.add(new ColorItem(R.color.material_color_red_700,  "Red 700"));
        gridItems.add(new ColorItem(R.color.material_color_red_800,  "Red 800"));
        gridItems.add(new ColorItem(R.color.material_color_red_900,  "Red 900"));
        gridItems.add(new ColorItem(R.color.material_color_red_A100, "Red A100"));
        gridItems.add(new ColorItem(R.color.material_color_red_A200, "Red A200"));
        gridItems.add(new ColorItem(R.color.material_color_red_A400, "Red A400"));
        gridItems.add(new ColorItem(R.color.material_color_red_A700, "Red A700"));

        gridItems.add(new ColorItem(R.color.material_color_pink_50,   "Pink 50"));
        gridItems.add(new ColorItem(R.color.material_color_pink_100,  "Pink 100"));
        gridItems.add(new ColorItem(R.color.material_color_pink_200,  "Pink 200"));
        gridItems.add(new ColorItem(R.color.material_color_pink_300,  "Pink 300"));
        gridItems.add(new ColorItem(R.color.material_color_pink_400,  "Pink 400"));
        gridItems.add(new ColorItem(R.color.material_color_pink_500,  "Pink 500"));
        gridItems.add(new ColorItem(R.color.material_color_pink_600,  "Pink 600"));
        gridItems.add(new ColorItem(R.color.material_color_pink_700,  "Pink 700"));
        gridItems.add(new ColorItem(R.color.material_color_pink_800,  "Pink 800"));
        gridItems.add(new ColorItem(R.color.material_color_pink_900,  "Pink 900"));
        gridItems.add(new ColorItem(R.color.material_color_pink_A100, "Pink A100"));
        gridItems.add(new ColorItem(R.color.material_color_pink_A200, "Pink A200"));
        gridItems.add(new ColorItem(R.color.material_color_pink_A400, "Pink A400"));
        gridItems.add(new ColorItem(R.color.material_color_pink_A700, "Pink A700"));

        gridItems.add(new ColorItem(R.color.material_color_purple_50,   "Purple 50"));
        gridItems.add(new ColorItem(R.color.material_color_purple_100,  "Purple 100"));
        gridItems.add(new ColorItem(R.color.material_color_purple_200,  "Purple 200"));
        gridItems.add(new ColorItem(R.color.material_color_purple_300,  "Purple 300"));
        gridItems.add(new ColorItem(R.color.material_color_purple_400,  "Purple 400"));
        gridItems.add(new ColorItem(R.color.material_color_purple_500,  "Purple 500"));
        gridItems.add(new ColorItem(R.color.material_color_purple_600,  "Purple 600"));
        gridItems.add(new ColorItem(R.color.material_color_purple_700,  "Purple 700"));
        gridItems.add(new ColorItem(R.color.material_color_purple_800,  "Purple 800"));
        gridItems.add(new ColorItem(R.color.material_color_purple_900,  "Purple 900"));
        gridItems.add(new ColorItem(R.color.material_color_purple_A100, "Purple A100"));
        gridItems.add(new ColorItem(R.color.material_color_purple_A200, "Purple A200"));
        gridItems.add(new ColorItem(R.color.material_color_purple_A400, "Purple A400"));
        gridItems.add(new ColorItem(R.color.material_color_purple_A700, "Purple A700"));

        gridItems.add(new ColorItem(R.color.material_color_deep_purple_50,   "Deep purple 50"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_100,  "Deep purple 100"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_200,  "Deep purple 200"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_300,  "Deep purple 300"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_400,  "Deep purple 400"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_500,  "Deep purple 500"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_600,  "Deep purple 600"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_700,  "Deep purple 700"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_800,  "Deep purple 800"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_900,  "Deep purple 900"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_A100, "Deep purple A100"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_A200, "Deep purple A200"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_A400, "Deep purple A400"));
        gridItems.add(new ColorItem(R.color.material_color_deep_purple_A700, "Deep purple A700"));

        gridItems.add(new ColorItem(R.color.material_color_indigo_50,   "Indigo 50"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_100,  "Indigo 100"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_200,  "Indigo 200"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_300,  "Indigo 300"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_400,  "Indigo 400"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_500,  "Indigo 500"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_600,  "Indigo 600"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_700,  "Indigo 700"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_800,  "Indigo 800"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_900,  "Indigo 900"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_A100, "Indigo A100"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_A200, "Indigo A200"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_A400, "Indigo A400"));
        gridItems.add(new ColorItem(R.color.material_color_indigo_A700, "Indigo A700"));

        gridItems.add(new ColorItem(R.color.material_color_blue_50,   "Blue 50"));
        gridItems.add(new ColorItem(R.color.material_color_blue_100,  "Blue 100"));
        gridItems.add(new ColorItem(R.color.material_color_blue_200,  "Blue 200"));
        gridItems.add(new ColorItem(R.color.material_color_blue_300,  "Blue 300"));
        gridItems.add(new ColorItem(R.color.material_color_blue_400,  "Blue 400"));
        gridItems.add(new ColorItem(R.color.material_color_blue_500,  "Blue 500"));
        gridItems.add(new ColorItem(R.color.material_color_blue_600,  "Blue 600"));
        gridItems.add(new ColorItem(R.color.material_color_blue_700,  "Blue 700"));
        gridItems.add(new ColorItem(R.color.material_color_blue_800,  "Blue 800"));
        gridItems.add(new ColorItem(R.color.material_color_blue_900,  "Blue 900"));
        gridItems.add(new ColorItem(R.color.material_color_blue_A100, "Blue A100"));
        gridItems.add(new ColorItem(R.color.material_color_blue_A200, "Blue A200"));
        gridItems.add(new ColorItem(R.color.material_color_blue_A400, "Blue A400"));
        gridItems.add(new ColorItem(R.color.material_color_blue_A700, "Blue A700"));

        gridItems.add(new ColorItem(R.color.material_color_light_blue_50,   "Light blue 50"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_100,  "Light blue 100"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_200,  "Light blue 200"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_300,  "Light blue 300"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_400,  "Light blue 400"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_500,  "Light blue 500"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_600,  "Light blue 600"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_700,  "Light blue 700"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_800,  "Light blue 800"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_900,  "Light blue 900"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_A100, "Light blue A100"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_A200, "Light blue A200"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_A400, "Light blue A400"));
        gridItems.add(new ColorItem(R.color.material_color_light_blue_A700, "Light blue A700"));

        gridItems.add(new ColorItem(R.color.material_color_cyan_50,   "Cyan 50"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_100,  "Cyan 100"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_200,  "Cyan 200"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_300,  "Cyan 300"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_400,  "Cyan 400"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_500,  "Cyan 500"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_600,  "Cyan 600"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_700,  "Cyan 700"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_800,  "Cyan 800"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_900,  "Cyan 900"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_A100, "Cyan A100"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_A200, "Cyan A200"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_A400, "Cyan A400"));
        gridItems.add(new ColorItem(R.color.material_color_cyan_A700, "Cyan A700"));

        gridItems.add(new ColorItem(R.color.material_color_teal_50,   "Teal 50"));
        gridItems.add(new ColorItem(R.color.material_color_teal_100,  "Teal 100"));
        gridItems.add(new ColorItem(R.color.material_color_teal_200,  "Teal 200"));
        gridItems.add(new ColorItem(R.color.material_color_teal_300,  "Teal 300"));
        gridItems.add(new ColorItem(R.color.material_color_teal_400,  "Teal 400"));
        gridItems.add(new ColorItem(R.color.material_color_teal_500,  "Teal 500"));
        gridItems.add(new ColorItem(R.color.material_color_teal_600,  "Teal 600"));
        gridItems.add(new ColorItem(R.color.material_color_teal_700,  "Teal 700"));
        gridItems.add(new ColorItem(R.color.material_color_teal_800,  "Teal 800"));
        gridItems.add(new ColorItem(R.color.material_color_teal_900,  "Teal 900"));
        gridItems.add(new ColorItem(R.color.material_color_teal_A100, "Teal A100"));
        gridItems.add(new ColorItem(R.color.material_color_teal_A200, "Teal A200"));
        gridItems.add(new ColorItem(R.color.material_color_teal_A400, "Teal A400"));
        gridItems.add(new ColorItem(R.color.material_color_teal_A700, "Teal A700"));

        gridItems.add(new ColorItem(R.color.material_color_green_50,   "Green 50"));
        gridItems.add(new ColorItem(R.color.material_color_green_100,  "Green 100"));
        gridItems.add(new ColorItem(R.color.material_color_green_200,  "Green 200"));
        gridItems.add(new ColorItem(R.color.material_color_green_300,  "Green 300"));
        gridItems.add(new ColorItem(R.color.material_color_green_400,  "Green 400"));
        gridItems.add(new ColorItem(R.color.material_color_green_500,  "Green 500"));
        gridItems.add(new ColorItem(R.color.material_color_green_600,  "Green 600"));
        gridItems.add(new ColorItem(R.color.material_color_green_700,  "Green 700"));
        gridItems.add(new ColorItem(R.color.material_color_green_800,  "Green 800"));
        gridItems.add(new ColorItem(R.color.material_color_green_900,  "Green 900"));
        gridItems.add(new ColorItem(R.color.material_color_green_A100, "Green A100"));
        gridItems.add(new ColorItem(R.color.material_color_green_A200, "Green A200"));
        gridItems.add(new ColorItem(R.color.material_color_green_A400, "Green A400"));
        gridItems.add(new ColorItem(R.color.material_color_green_A700, "Green A700"));

        gridItems.add(new ColorItem(R.color.material_color_light_green_50,   "Light green 50"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_100,  "Light green 100"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_200,  "Light green 200"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_300,  "Light green 300"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_400,  "Light green 400"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_500,  "Light green 500"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_600,  "Light green 600"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_700,  "Light green 700"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_800,  "Light green 800"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_900,  "Light green 900"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_A100, "Light green A100"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_A200, "Light green A200"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_A400, "Light green A400"));
        gridItems.add(new ColorItem(R.color.material_color_light_green_A700, "Light green A700"));

        gridItems.add(new ColorItem(R.color.material_color_lime_50,   "Lime 50"));
        gridItems.add(new ColorItem(R.color.material_color_lime_100,  "Lime 100"));
        gridItems.add(new ColorItem(R.color.material_color_lime_200,  "Lime 200"));
        gridItems.add(new ColorItem(R.color.material_color_lime_300,  "Lime 300"));
        gridItems.add(new ColorItem(R.color.material_color_lime_400,  "Lime 400"));
        gridItems.add(new ColorItem(R.color.material_color_lime_500,  "Lime 500"));
        gridItems.add(new ColorItem(R.color.material_color_lime_600,  "Lime 600"));
        gridItems.add(new ColorItem(R.color.material_color_lime_700,  "Lime 700"));
        gridItems.add(new ColorItem(R.color.material_color_lime_800,  "Lime 800"));
        gridItems.add(new ColorItem(R.color.material_color_lime_900,  "Lime 900"));
        gridItems.add(new ColorItem(R.color.material_color_lime_A100, "Lime A100"));
        gridItems.add(new ColorItem(R.color.material_color_lime_A200, "Lime A200"));
        gridItems.add(new ColorItem(R.color.material_color_lime_A400, "Lime A400"));
        gridItems.add(new ColorItem(R.color.material_color_lime_A700, "Lime A700"));

        gridItems.add(new ColorItem(R.color.material_color_yellow_50,   "Yellow 50"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_100,  "Yellow 100"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_200,  "Yellow 200"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_300,  "Yellow 300"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_400,  "Yellow 400"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_500,  "Yellow 500"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_600,  "Yellow 600"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_700,  "Yellow 700"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_800,  "Yellow 800"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_900,  "Yellow 900"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_A100, "Yellow A100"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_A200, "Yellow A200"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_A400, "Yellow A400"));
        gridItems.add(new ColorItem(R.color.material_color_yellow_A700, "Yellow A700"));

        gridItems.add(new ColorItem(R.color.material_color_amber_50,   "Amber 50"));
        gridItems.add(new ColorItem(R.color.material_color_amber_100,  "Amber 100"));
        gridItems.add(new ColorItem(R.color.material_color_amber_200,  "Amber 200"));
        gridItems.add(new ColorItem(R.color.material_color_amber_300,  "Amber 300"));
        gridItems.add(new ColorItem(R.color.material_color_amber_400,  "Amber 400"));
        gridItems.add(new ColorItem(R.color.material_color_amber_500,  "Amber 500"));
        gridItems.add(new ColorItem(R.color.material_color_amber_600,  "Amber 600"));
        gridItems.add(new ColorItem(R.color.material_color_amber_700,  "Amber 700"));
        gridItems.add(new ColorItem(R.color.material_color_amber_800,  "Amber 800"));
        gridItems.add(new ColorItem(R.color.material_color_amber_900,  "Amber 900"));
        gridItems.add(new ColorItem(R.color.material_color_amber_A100, "Amber A100"));
        gridItems.add(new ColorItem(R.color.material_color_amber_A200, "Amber A200"));
        gridItems.add(new ColorItem(R.color.material_color_amber_A400, "Amber A400"));
        gridItems.add(new ColorItem(R.color.material_color_amber_A700, "Amber A700"));

        gridItems.add(new ColorItem(R.color.material_color_orange_50,   "Orange 50"));
        gridItems.add(new ColorItem(R.color.material_color_orange_100,  "Orange 100"));
        gridItems.add(new ColorItem(R.color.material_color_orange_200,  "Orange 200"));
        gridItems.add(new ColorItem(R.color.material_color_orange_300,  "Orange 300"));
        gridItems.add(new ColorItem(R.color.material_color_orange_400,  "Orange 400"));
        gridItems.add(new ColorItem(R.color.material_color_orange_500,  "Orange 500"));
        gridItems.add(new ColorItem(R.color.material_color_orange_600,  "Orange 600"));
        gridItems.add(new ColorItem(R.color.material_color_orange_700,  "Orange 700"));
        gridItems.add(new ColorItem(R.color.material_color_orange_800,  "Orange 800"));
        gridItems.add(new ColorItem(R.color.material_color_orange_900,  "Orange 900"));
        gridItems.add(new ColorItem(R.color.material_color_orange_A100, "Orange A100"));
        gridItems.add(new ColorItem(R.color.material_color_orange_A200, "Orange A200"));
        gridItems.add(new ColorItem(R.color.material_color_orange_A400, "Orange A400"));
        gridItems.add(new ColorItem(R.color.material_color_orange_A700, "Orange A700"));

        gridItems.add(new ColorItem(R.color.material_color_deep_orange_50,   "Deep orange 50"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_100,  "Deep orange 100"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_200,  "Deep orange 200"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_300,  "Deep orange 300"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_400,  "Deep orange 400"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_500,  "Deep orange 500"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_600,  "Deep orange 600"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_700,  "Deep orange 700"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_800,  "Deep orange 800"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_900,  "Deep orange 900"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_A100, "Deep orange A100"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_A200, "Deep orange A200"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_A400, "Deep orange A400"));
        gridItems.add(new ColorItem(R.color.material_color_deep_orange_A700, "Deep orange A700"));

        gridItems.add(new ColorItem(R.color.material_color_brown_50,   "Brown 50"));
        gridItems.add(new ColorItem(R.color.material_color_brown_100,  "Brown 100"));
        gridItems.add(new ColorItem(R.color.material_color_brown_200,  "Brown 200"));
        gridItems.add(new ColorItem(R.color.material_color_brown_300,  "Brown 300"));
        gridItems.add(new ColorItem(R.color.material_color_brown_400,  "Brown 400"));
        gridItems.add(new ColorItem(R.color.material_color_brown_500,  "Brown 500"));
        gridItems.add(new ColorItem(R.color.material_color_brown_600,  "Brown 600"));
        gridItems.add(new ColorItem(R.color.material_color_brown_700,  "Brown 700"));
        gridItems.add(new ColorItem(R.color.material_color_brown_800,  "Brown 800"));
        gridItems.add(new ColorItem(R.color.material_color_brown_900,  "Brown 900"));

        gridItems.add(new ColorItem(R.color.material_color_gray_50,   "Gray 50"));
        gridItems.add(new ColorItem(R.color.material_color_gray_100,  "Gray 100"));
        gridItems.add(new ColorItem(R.color.material_color_gray_200,  "Gray 200"));
        gridItems.add(new ColorItem(R.color.material_color_gray_300,  "Gray 300"));
        gridItems.add(new ColorItem(R.color.material_color_gray_400,  "Gray 400"));
        gridItems.add(new ColorItem(R.color.material_color_gray_500,  "Gray 500"));
        gridItems.add(new ColorItem(R.color.material_color_gray_600,  "Gray 600"));
        gridItems.add(new ColorItem(R.color.material_color_gray_700,  "Gray 700"));
        gridItems.add(new ColorItem(R.color.material_color_gray_800,  "Gray 800"));
        gridItems.add(new ColorItem(R.color.material_color_gray_900,  "Gray 900"));

        gridItems.add(new ColorItem(R.color.material_color_black, "Black"));
        gridItems.add(new ColorItem(R.color.material_color_white, "White"));

        ColorGridAdapter colorGridAdapter = new ColorGridAdapter(this, R.layout.adapter_color_grid, gridItems);
        GridView gridView = findViewById(R.id.grid);
        gridView.setAdapter(colorGridAdapter);
        colorGridAdapter.notifyDataSetChanged();

        int colNum = (int) convertPixelsToDp(getResources().getDisplayMetrics().widthPixels) / 160;
        gridView.setNumColumns(Math.max(colNum, 1));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.action_privacy) {
            Intent i = new Intent(this, AboutActivity.class);
            i.putExtra(EXTRA_PRIVACY_POLICY, true);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private float convertPixelsToDp(float px){
        return px / ((float) getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    class ColorItem {
        @ColorRes int mColorRes;
        String mName;

        ColorItem(@ColorRes int colorRes, String name) {
            mColorRes = colorRes;
            mName = name;
        }
    }

    class ColorGridAdapter extends ArrayAdapter<ColorItem> {
        private final String TAG = ColorGridAdapter.class.getSimpleName();
        ColorGridAdapter(Context context, int resource, List<ColorItem> items) {
            super(context, resource, items);
        }

        @Override
        public View getView(int position, View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.adapter_color_grid, null);
            }
            final ColorItem colorItem = getItem(position);
            if (colorItem == null) {
                return convertView;
            }
            TextView name = convertView.findViewById(R.id.name);
            CardView card = convertView.findViewById(R.id.card);

            @ColorInt int itemColor = ContextCompat.getColor(getContext(), colorItem.mColorRes);
            card.setCardBackgroundColor(itemColor);
            card.setOnClickListener(v -> {
                Context context = getContext();
                try {
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    String colorAsText = "#" + Integer.toHexString(itemColor & 0x00ffffff).toUpperCase();
                    String text = getString(R.string.copied, colorAsText);
                    ClipData clip = ClipData.newPlainText(getString(R.string.color), colorAsText);
                    clipboard.setPrimaryClip(clip);
                    Toasty.custom(context, text, ContextCompat.getDrawable(context, R.drawable.ic_palette_white_24dp),
                            ContextCompat.getColor(context, R.color.colorPrimaryDark), Toast.LENGTH_SHORT, true, true).show();
                } catch (Exception e) {
                    Log.e(TAG, "Error copying to clipboard", e);
                    Toasty.error(getApplicationContext(), getString(R.string.copy_error)).show();
                }
            });
            name.setText(colorItem.mName);

            return convertView;
        }
    }

}
