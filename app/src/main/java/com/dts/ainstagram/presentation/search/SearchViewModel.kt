package com.dts.ainstagram.presentation.search

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dts.ainstagram.domain.model.SearchItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {

    fun fetchData(): List<SearchItem> {
        val searchList = mutableListOf<SearchItem>()
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1517841905240-472988babdf9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1502325966718-85a90488dc29",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1628457882318-b8d98482b38c",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.add(
            SearchItem(
                "https://images.unsplash.com/photo-1629638640561-326adc0423e9",
                SearchItem.Tag.NATURE
            )
        )
        searchList.forEachIndexed { index, searchItem ->
            if (index % 6 == 0 || index % 6 == 4) {
                searchItem.size = SearchItem.Size.BIG
            } else {
                searchItem.size = SearchItem.Size.SMALL
            }
        }
        return searchList
    }
}