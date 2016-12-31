package tg.lahorde.elitegreen;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by pondikpa on 21/12/16.
 */

public class FonctionsUtiles extends Activity {
    public  void affichermaladies(){
        Intent intent = new Intent(this,Maux.class);
        intent.putExtra("madonn","AAPE");
        this.startActivityForResult(intent,1000);

    }
    public static void regions(Spinner liste){

    }
    public static void prefectures(Spinner liste){

    }

}
