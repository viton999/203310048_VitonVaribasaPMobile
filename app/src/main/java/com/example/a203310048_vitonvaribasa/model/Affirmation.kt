package com.example.a203310048_vitonvaribasa.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//membuat class affirmation dimana String res mendefinisikan stringResource dan DrawableRes mendefinisikan imageResourceId
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)