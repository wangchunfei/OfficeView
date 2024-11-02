package com.wangchunfei.office.util;

import androidx.annotation.NonNull;

public interface OnActivityPermissionCallback {

    void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);

    void onActivityForResult(int requestCode);
}
