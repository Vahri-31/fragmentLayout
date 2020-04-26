package demo.t.fragmentlayoutex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentHome(),"HOME");
        adapter.AddFragment(new FragmentExplore(),"Explore");
        adapter.AddFragment(new FragmentAccount(),"Account");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
