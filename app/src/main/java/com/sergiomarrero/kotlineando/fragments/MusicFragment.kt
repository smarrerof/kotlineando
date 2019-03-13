package com.sergiomarrero.kotlineando

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sergiomarrero.kotlineando.R


class MusicFragment : Fragment() {
    companion object {
        fun newInstance(): MusicFragment = MusicFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_music, container, false)
}