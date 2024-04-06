package com.example.baitap;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public class PermissionHelper {

    public static final int REQUEST_CODE_PERMISSION = 123;

    public static boolean hasPermission(Context context, String permission) {
        // Kiểm tra quyền với API level 23 trở lên
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
        }

        // Nếu dưới API level 23, mọi quyền được cho là đã được cấp
        return true;
    }

    public static void requestPermission(Context context, String permission) {
        // Kiểm tra nếu quyền chưa được cấp, thì yêu cầu người dùng cấp quyền
        if (!hasPermission(context, permission)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                // Yêu cầu quyền
                ((Activity) context).requestPermissions(new String[]{permission}, REQUEST_CODE_PERMISSION);
            }
        }
    }
}
