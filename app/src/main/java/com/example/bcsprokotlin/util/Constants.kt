package com.example.bcsprokotlin.util

class Constants {
    companion object {
        const val API_KEY = "abc123"
        const val BASE_URL = "https://bcs.bdstar.xyz"
        const val PAGE_SIZE = 40
        const val NORMAL_EXAM = "normal"
        const val SUBJECT_BASED_EXAM = "subjectBased"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20

        //        const val BANGLA = "বাংলা"
//        const val ENGLISH = "ইংরেজি"
//        const val MATH = "গণিত"
//        const val GENERA_SCIENCE = "সাধারণ বিজ্ঞান"
//        const val ICT = "কম্পিউটার ও তথ্য প্রযুক্তি"
//        const val INTERNATIONAL_AFFAIRS = "আন্তর্জাতিক বিষয়াবলি"
//        const val BANGLADESH_AFFAIRS = "বাংলাদেশ বিষয়াবলি"
//        const val GEOGRAPHY = "ভূগোল"
//        const val MENTAL_ABILITY= "মানসিক দক্ষতা"
//        const val ETHICS= "নৈতিকতা মুল্যবোধ ও সুশাসন"
        val subjectsName = listOf(
            "আন্তর্জাতিক বিষয়াবলি",
            "বাংলাদেশ বিষয়াবলি",
            "বাংলা",
            "নৈতিকতা মুল্যবোধ ও সুশাসন",
            "ভূগোল",
            "গণিত",
            "ইংরেজি",
            "মানসিক দক্ষতা",
            "সাধারণ বিজ্ঞান",
            "কম্পিউটার ও তথ্য প্রযুক্তি"
        )


    }
}