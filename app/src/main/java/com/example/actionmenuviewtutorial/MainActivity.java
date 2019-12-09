package com.example.actionmenuviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ActionMenuView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
This is a tutorial for the ActionMenuView
Follow the TODO for this project
TODO 1: CREATE THE menu.xml
TODO 2: add action menu view to the main activity xml file

**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 3: This is to inflate the ActionMenuBar

        ActionMenuView bottomBar = (ActionMenuView) findViewById(R.id.toolbar_bottom);
        //TODO 4: uses getMenu() to get the Menu content
        Menu bottomMenu = bottomBar.getMenu();
        getMenuInflater().inflate(R.menu.menu, bottomMenu);
        //TODO 5:a simple loop that will display a toast message which ever menu is selected
        for (int i = 0; i < bottomMenu.size(); i++){
            bottomMenu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                  Toast.makeText(MainActivity.this,"Hello world" + item,Toast.LENGTH_LONG);
                    return onOptionsItemSelected(item);
                }
            });
        }
    }
}
