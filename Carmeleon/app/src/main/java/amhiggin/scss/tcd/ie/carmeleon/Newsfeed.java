package amhiggin.scss.tcd.ie.carmeleon;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Newsfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        //SHow the centra offer
        final ImageView imgtable = (ImageView) findViewById(R.id.centraOffer);
        final Bitmap centraimg = BitmapFactory.decodeResource(getResources(), R.mipmap.centra_offer);
        imgtable.setImageBitmap(centraimg);

        //SHow the insomnia offer
        final ImageView imgtable1 = (ImageView) findViewById(R.id.insomniaOffer);
        final Bitmap insomniaimg = BitmapFactory.decodeResource(getResources(), R.mipmap.insomnia_offer);
        imgtable1.setImageBitmap(insomniaimg);

        //SHow the centra offer
        final ImageView imgtable2 = (ImageView) findViewById(R.id.topazOffer);
        final Bitmap topazimg = BitmapFactory.decodeResource(getResources(), R.mipmap.topaz_offer);
        imgtable2.setImageBitmap(topazimg);


    }
}
