/*
 * Copyright © 2022 GFF. All rights reserved.
 *
 * Android Compose Template
 *
 * Created by GFF developers.
 */
package com.zw.zwbase.core

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
object NetworkConfig {
    val connectTimeoutSeconds: Long = 60
    val readTimeoutSeconds: Long = 60
    val writeTimeoutSeconds: Long = 60
}
