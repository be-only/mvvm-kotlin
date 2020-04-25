package com.bedarmawan.basemvvm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Class which provides a model for post
 * @constructor Sets all properties of the post
 * @property versionName the versionName
 */
@Entity
data class Splash(
        val versionName: String
)