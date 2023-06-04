package com.techsultan.edusys.features.onboarding

import androidx.annotation.DrawableRes
import com.techsultan.edusys.R

sealed class OnBoardingPage(
    @DrawableRes
    val image : Int,
    val title : String,
    val description : String
) {

    object First : OnBoardingPage(
        image = R.drawable.onboarding_one,
        title = "About",
        description = "EduOnboard is an innovative and user-friendly educational app"
    )
    object Second : OnBoardingPage(
        image = R.drawable.onboarding_two,
        title = "Contents",
        description = "EduOnboard boasts a vast library of meticulously curated educational resources spanning various subjects, from mathematics and science to literature and history."
    )
    object Third : OnBoardingPage(
        image = R.drawable.onboarding_one,
        title = "Features",
        description = "One of the key features of EduOnboard is its gamified learning approach, which transforms the learning process into an exciting adventure"
    )
}