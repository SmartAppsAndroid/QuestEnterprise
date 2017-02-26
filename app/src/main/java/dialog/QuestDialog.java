package dialog;

import android.app.Activity;
import android.app.AlertDialog;

/**
 * Created by skumbam on 23-02-2017.
 */

public  class QuestDialog {


    public static void showOkDialog(Activity activity,String title ,String message){
        showDialogBuilder(activity,getAlertDialogBuilder(activity)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK",null)
                .create());
    }


    public static AlertDialog.Builder getAlertDialogBuilder(Activity activity){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(activity);
        return dialogBuilder;
    }

    public static void showDialogBuilder(Activity activity, final AlertDialog alertDialog){

        if(alertDialog!=null){
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    alertDialog.show();
                }
            });
        }
    }
}
