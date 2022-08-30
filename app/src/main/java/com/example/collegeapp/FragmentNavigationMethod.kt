package com.example.collegeapp

import androidx.navigation.NavController
import androidx.navigation.NavOptions

class FragmentNavigationMethod {

    companion object {
        fun navigate(action: Int, navController: NavController) {
            try {
                navController.navigate(action)
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
            }

        }

        fun navigateWithPopUp(
            action: Int,
            navController: NavController,
            popUpId: Int,
            inclusive: Boolean
        ) {
            val options = NavOptions.Builder().setPopUpTo(popUpId, inclusive).build()
            try {
                navController.navigate(action, null, options)
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
            }
        }

//        fun navigateWithPopUpDestPop(
//            dest: Int,
//            navController: NavController,
//            inclusive: Boolean
//        ) {
//            val options = NavOptions.Builder().setPopUpTo(0,inclusive).build()
////            navController.popBackStack()
////            navController.popBackStack(0,true,options)
//
//            try {
//                navController.navigate(dest,options)
//            } catch (e: IllegalArgumentException) {
//                e.printStackTrace()
//            }
//
//        }
    }
}