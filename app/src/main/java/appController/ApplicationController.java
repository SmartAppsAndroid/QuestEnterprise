package appController;

import android.app.Application;

import quest.com.quest.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by skumbam on 24-02-2017.
 */

public class ApplicationController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/UbuntuMono-R.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
