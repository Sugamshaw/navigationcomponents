package com.sugam.navigationcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class MAINFragment : Fragment() {
    lateinit var usernameTxt:TextView
    lateinit var passwordTxt:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_m_a_i_n, container, false)
        usernameTxt = view.findViewById(R.id.usernameTxt)
        passwordTxt = view.findViewById(R.id.passwordTxt)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





    }

}