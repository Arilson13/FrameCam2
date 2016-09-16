package com.example.orochimaru.framecam2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {
    ViewPager pager;
    PagerTabStrip tab_strp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab);

        ma_pager_adapter mapager=new ma_pager_adapter(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);

        pager.setAdapter(mapager);
        tab_strp=(PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);
        //alterar o tamanho da fonte das tabs...
        tab_strp.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
