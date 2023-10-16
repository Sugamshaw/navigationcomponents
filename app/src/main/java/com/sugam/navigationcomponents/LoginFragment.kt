package com.sugam.navigationcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class LoginFragment : Fragment(R.layout.fragment_login) {

    val args: LoginFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button_Login = view.findViewById<Button>(R.id.button_Login)
        val username = view.findViewById<EditText>(R.id.username)
        val password = view.findViewById<EditText>(R.id.password)
        val usernamedeeplink = args?.username

        username.setText(usernamedeeplink)

        button_Login.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("username", username.text.toString())
            bundle.putString("password", password.text.toString())
            findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment,bundle)
        }

    }


}