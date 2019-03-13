package com.sergiomarrero.kotlineando

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sergiomarrero.kotlineando.R


class BooksFragment : Fragment() {
    companion object {
        fun newInstance(): BooksFragment = BooksFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_books, container, false)
}