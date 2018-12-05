package top.gytest.bookandroid;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

       private DrawerLayout mDrawerLayout;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                setContentView(R.layout.activity_main);

           Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
           setSupportActionBar(toolbar);

              mDrawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);

            NavigationView navView=(NavigationView)findViewById(R.id.nav_view);

            ActionBar actionBar=getSupportActionBar();
                if(actionBar != null){
                        actionBar.setDisplayHomeAsUpEnabled(true);
                       // actionBar.setHomeAsUpIndicator(R.drawable.head);
                }
                navView.setCheckedItem(R.id.nav_people);
                navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        mDrawerLayout.closeDrawers();
                        return false;
                    }
                });

                //findViewById(R.id.Iv_m_head).setOnClickListener(this);



        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.toolbar,menu);
            return true;
        }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//            switch (item.getItemId()){
//                case R.id.sign:
//                    Toast.makeText(this,"YOU clicked sign",Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.search:
//                    Toast.makeText(this,"YOU clicked search",Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.settings:
//                    Toast.makeText(this,"YOU clicked settings",Toast.LENGTH_SHORT).show();
//                    break;
//                    default:
//            }
//        return true;
//    }
}



