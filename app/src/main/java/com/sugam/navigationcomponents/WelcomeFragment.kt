package com.sugam.navigationcomponents

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class WelcomeFragment : Fragment() {

    lateinit var usernameTxt: TextView
    lateinit var passwordTxt: TextView
    lateinit var button_login2:Button
    val args:WelcomeFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        usernameTxt = view.findViewById(R.id.usernameTxt)
        passwordTxt = view.findViewById(R.id.passwordTxt)
        button_login2=view.findViewById(R.id.button_login2)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameValue = args.username
        val passwordValue = args.password

        if (!usernameValue.isNullOrBlank() && !passwordValue.isNullOrBlank()) {
            usernameTxt.text = usernameValue
            passwordTxt.text = passwordValue
        } else {
            Toast.makeText(requireContext(), "not done", Toast.LENGTH_SHORT).show()
        }

        button_login2.setOnClickListener{
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        }
    }


}