package com.samuel.demo.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.samuel.demo.R
import com.samuel.demo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * @Description:
 * @author sunyao
 * @date 2018/10/26 5:46 PM
 */
class MainPageFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        to_fragment_2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_page2Fragment)
        }
    }
}