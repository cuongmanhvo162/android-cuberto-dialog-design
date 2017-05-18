package com.cuongmv162.cubertodialog.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;

/**
 * Created by cuongvo on 5/18/17.
 */

public class ImageUtil {
    public static RoundedBitmapDrawable getRoundedImage(Context context, int imageId) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageId);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(context.getResources(), bitmap);
        roundedBitmapDrawable.setCornerRadius(8);

        return roundedBitmapDrawable;
    }
}
