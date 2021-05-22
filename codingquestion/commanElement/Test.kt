package com.kdroid.kotlintuts.codingquestion.commanElement

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import java.util.function.Predicate
import java.util.stream.Collectors

object Test {
    @RequiresApi(api = Build.VERSION_CODES.N)
    @JvmStatic
    fun main(args: Array<String>) {
        val listOne: ArrayList<Test1> = ArrayList()
        val listTwo: ArrayList<Test1> = ArrayList()
        listOne.add(Test1("3", "4"))
        listOne.add(Test1("5", "6"))
        listTwo.add(Test1("1", "2"))
        listTwo.add(Test1("3", "4"))
        listTwo.add(Test1("5", "6"))
        listTwo.add(Test1("8", "9"))
        println()

        // Print results from loop method.
//        System.out.println("Results from loop method:");
//        List<Test1> resultsViaLoop = createSharedListViaStream(listOne, listTwo);
//        for (Test1 obj : resultsViaLoop) {
//            System.out.println(obj.getA());
//        }
        val setOne: Set<Test1> = HashSet(listOne)
        val listCommon: List<Test1> = listTwo.stream()
            .filter { o -> setOne.contains(o) }
            .collect(Collectors.toList())
        for (obj: Test1 in listCommon) {
            println(obj.getA())
        }
    }

    fun createSharedListViaLoop(listOne: List<Test1>, listTwo: List<Test1>): List<Test1> {
        val result: MutableList<Test1> = ArrayList()
        for (one: Test1 in listOne) {
            for (two: Test1 in listTwo) {
                if ((one.getA() == two.getA()) && (one.getB() == two.getB())) {
                    result.add(one)
                }
            }
        }
        return result
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    fun createSharedListViaStream(listOne: List<Test1>, listTwo: List<Test1>): List<Test1> {
        val listOneList: List<Test1> = listOne.stream().filter({ two: Test1 ->
            listTwo.stream()
                .anyMatch(Predicate { one: Test1 -> (one.getA() == two.getA()) && (two.getB() == one.getB()) })
        })
            .collect(Collectors.toList())
        return listOneList
    }
}