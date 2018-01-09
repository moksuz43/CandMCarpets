package com.example.moksu.candmcarpets.Services

import com.example.moksu.candmcarpets.Model.Category
import com.example.moksu.candmcarpets.Model.Product

/**
 * Created by moksu on 09/01/2018.
 */
object DateService {

    val categories = listOf(
            Category ("Carpets", "carpet"),
            Category("Vinyls", "vinyl"),
            Category("Laminates", "laminate"),
            Category("Camaro Loc", "camaro"),
            Category("Underlay","underlayy")

    )

    val carpets = listOf(
            Product("", "","")


    )
    val laminates = listOf(
            Product("", "", "")
    )

    val vinyls = listOf(
            Product("","","")

    )

    val underlay = listOf(
            Product("", "", "")
    )

    val camaro = listOf(
            Product("", "", "")
    )
}