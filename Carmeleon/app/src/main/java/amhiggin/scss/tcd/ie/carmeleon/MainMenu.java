package amhiggin.scss.tcd.ie.carmeleon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button button = (Button) findViewById(R.id.enterButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goToNewsfeedActivity();
            }
        });

        final ImageView imgtable = (ImageView) findViewById(R.id.imageView);
        final Bitmap img2 = BitmapFactory.decodeResource(getResources(), R.mipmap.mainmenu_logo);
        imgtable.setImageBitmap(img2);
    }

    private void goToNewsfeedActivity() {
        Intent intent = new Intent(this, Newsfeed.class);
        startActivity(intent);

    }
}