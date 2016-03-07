package amhiggin.scss.tcd.ie.carmeleon;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final ImageView imgtable = (ImageView)findViewById(R.id.imageView);
        final Bitmap img2 = BitmapFactory.decodeResource(getResources(), R.mipmap.mainmenu_logo);
        imgtable.setImageBitmap(img2);
    }
}
