package com.uistack.jetpackcompose4.ui.Navigation

sealed class AppScreens(val route: String){
    object MainPageScreen: AppScreens("MainPageScreen")
    object OptionsScreen: AppScreens("OptionsScreen")
    object LoginScreen: AppScreens("LoginScreen")
    object RegisterScreen: AppScreens("RegisterScreen")
    object ForgotPasswordScreen: AppScreens("ForgotPasswordScreen")
    object PremiumScreen: AppScreens("PremiumScreen")
    object SettingsScreen: AppScreens("SettingsScreen")
    object MainScreen: AppScreens("MainScreen")
    object jobScreen: AppScreens("jobScreen")
}


